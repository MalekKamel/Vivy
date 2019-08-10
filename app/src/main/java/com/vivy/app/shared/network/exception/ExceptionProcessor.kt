package com.vivy.app.shared.network.exception

import android.text.TextUtils
import com.annimon.stream.Stream
import com.vivy.app.R
import com.vivy.app.shared.network.HttpExceptionUtil
import com.vivy.app.shared.network.RetrofitUtil
import com.vivy.app.shared.network.exception.handler.http.HttpExceptionInfo
import com.vivy.app.shared.network.exception.handler.http.ServerErrorHandler
import com.vivy.app.shared.network.exception.handler.http.TokenExpiredHandler
import com.vivy.app.shared.network.exception.handler.nonhttp.IoExceptionHandler
import com.vivy.app.shared.network.exception.handler.nonhttp.NoSuchElementHandler
import com.vivy.app.shared.network.exception.handler.nonhttp.NonHttpExceptionInfo
import com.vivy.app.shared.network.exception.handler.nonhttp.OutOfMemoryErrorHandler
import com.vivy.app.shared.util.CrashlyticsUtil
import retrofit2.HttpException

/**
 * Created by Sha on 10/9/17.
 */

class ExceptionProcessor private constructor() {

    private val httpHandlers = listOf(TokenExpiredHandler(), ServerErrorHandler())

    private val nonHttpHandlers = listOf(IoExceptionHandler(), NoSuchElementHandler(), OutOfMemoryErrorHandler())

    internal fun process(throwable: Throwable, presenter: ExceptionPresenter) {
        try {

            if (throwable is HttpException) {
                handleHttpException(throwable, presenter)
                return
            }

            handleNonHttpException(throwable, presenter)

        } catch (e: Exception) {
            e.printStackTrace()
            // Retrofit throws an exception
            unknownException(presenter, throwable)
        }

    }

    @Throws(Exception::class)
    private fun handleHttpException(
            throwable: Throwable,
            presenter: ExceptionPresenter
    ) {
        val httpException = throwable as HttpException

        val body = HttpExceptionUtil.error(httpException)
        val code = HttpExceptionUtil.code(httpException)
        if (code == null) {
            unknownException(presenter, throwable)
            return
        }

        val optHandler = Stream.of(httpHandlers)
                .filter { handler -> handler.canHandle(code) }
                .findFirst()

        if (!optHandler.isPresent) {
            showOriginalHttpMessage(body, presenter, throwable)
            return
        }

        val info = HttpExceptionInfo(
                throwable = throwable,
                presenter = presenter,
                errorBody = body,
                code = code
        )

        optHandler.get().handle(info)

    }

    private fun showOriginalHttpMessage(body: String, presenter: ExceptionPresenter, throwable: Throwable) {
        val contract = RetrofitUtil.parseHttpExceptionModel(body)

        if (TextUtils.isEmpty(contract.message)) {
            unknownException(presenter, throwable)
            return
        }

        presenter.showMessageInFlashBar(contract.message)
    }

    private fun handleNonHttpException(
            throwable: Throwable,
            presenter: ExceptionPresenter
    ) {
        val optHandler = Stream.of(nonHttpHandlers)
                .filter { handler -> handler.canHandle(throwable) }
                .findFirst()

        if (!optHandler.isPresent) {
            unknownException(presenter, throwable)
            return
        }

        val info = NonHttpExceptionInfo()
                .setPresenter(presenter)
                .setThrowable(throwable)

        optHandler.get().handle(info)
    }

    private fun unknownException(presenter: ExceptionPresenter, throwable: Throwable) {
        // Default handling, show generic problem.
        presenter.showMessageInFlashBar(R.string.oops_something_went_wrong)

        // Report Crashlytics to handle this exception in the future
        CrashlyticsUtil.log(throwable)
    }

    companion object {

        var instance = ExceptionProcessor()
    }


}
