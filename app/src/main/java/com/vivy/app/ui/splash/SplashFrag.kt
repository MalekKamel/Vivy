package com.vivy.app.ui.splash

import android.os.Handler
import androidx.navigation.Navigation
import com.vivy.app.R
import com.vivy.app.shared.data.AuthState
import com.vivy.app.shared.ui.frag.BaseFrag
import org.koin.android.viewmodel.ext.android.viewModel

class SplashFrag : BaseFrag<SplashVm>() {

    override var layoutId: Int = R.layout.frag_splash

    override val vm: SplashVm by viewModel()

    override fun setupUi() {

    }

    override fun doOnViewCreated() {
        Handler().postDelayed(
                {
                  val action =  when(vm.pref.authState()) {
                      AuthState.UNAUTHENTICATED -> R.id.action_splashFrag_to_loginFrag
                      AuthState.AUTHENTICATED -> R.id.action_splashFrag_to_searchFrag
                    }
                    Navigation.findNavController(view!!).navigate(action)
                },
                2000
        )
    }

}
