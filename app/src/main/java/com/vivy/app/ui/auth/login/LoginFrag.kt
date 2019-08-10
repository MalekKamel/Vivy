package com.vivy.app.ui.auth.login

import com.sha.formvalidator.FormValidator
import com.vivy.app.R
import com.vivy.app.shared.data.model.LoginRequest
import com.vivy.app.shared.ui.frag.BaseFrag
import com.vivy.app.shared.util.BuildUtil
import com.vivy.app.shared.util.textString
import kotlinx.android.synthetic.main.frag_login.*
import org.koin.android.viewmodel.ext.android.viewModel


class LoginFrag : BaseFrag<LoginVm>() {

    override val vm: LoginVm by viewModel()

    override var layoutId: Int = R.layout.frag_login

    override fun setupUi() {
        doLogin()
        debugCredentials()
    }

    private fun debugCredentials() {
        if (!BuildUtil.isDebug()) return
        etEmail.setText("androidChallenge@vivy.com")
        etPassword.setText("88888888")
    }

    private fun doLogin() {
        FormValidator(etEmail, etPassword)
                .validateOnClick(btnSubmit) { isValid ->
                    if(!isValid) return@validateOnClick

                        val request = LoginRequest(
                                username = etEmail.textString(),
                                password = etPassword.textString()
                        )
                        vm.login(request){
                            navController()?.navigate(R.id.action_loginFrag_to_searchFrag)
                        }

                }
    }

}

