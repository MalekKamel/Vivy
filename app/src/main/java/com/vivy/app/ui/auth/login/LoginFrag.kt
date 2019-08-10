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

/*

curl -d "username=androidChallenge@vivy.com&password=88888888" --header "Content-Type: application/x-www-form-urlencoded" --header "Accept: application/json" --header "Authorization: Basic aXBob25lOmlwaG9uZXdpbGxub3RiZXRoZXJlYW55bW9yZQ==" -X POST "https://auth.staging.vivy.com/oauth/token?grant_type=password"

===============

curl --header "Accept: application/json" --header "Authorization: Bearer ","token_type":"bearer","refresh_token":" " -X GET "https://api.staging.vivy.com/api/users/me/doctors?search=f&lat=52.534709&lng=13.3976972"

 */


}

