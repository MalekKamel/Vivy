package com.vivy.app.shared.koin

import androidx.preference.PreferenceManager
import com.vivy.app.BuildConfig
import com.vivy.app.shared.data.DataManager
import com.vivy.app.shared.network.ApiInterface
import com.vivy.app.shared.network.ApiRepository
import com.vivy.app.shared.network.interceptor.TokenInterceptor
import com.vivy.app.shared.rx.SchedulerProvider
import com.vivy.app.shared.rx.SchedulerProviderImpl
import com.vivy.app.shared.util.SharedPref
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val appModule = module {

    // ApiInterface
    single {

        Retrofit.Builder()
                .baseUrl(BuildConfig.API_BASE_URL)
                .client(get())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .build()
                .create(ApiInterface::class.java)
    }

    // OkHttpClient
    single {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY


        val builder = OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .addInterceptor(get<TokenInterceptor>())
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
        builder.build()
    }

    single { DataManager(get(), get(), get()) }

    single { ApiRepository(get()) }

    single { TokenInterceptor(get()) }


    single { SharedPref(get()) }

    // default pref
    single { PreferenceManager.getDefaultSharedPreferences(androidContext()) }

    single<SchedulerProvider> { SchedulerProviderImpl() }

}