package com.vivy.app.ui.auth.login

import com.vivy.app.shared.data.DataManager
import com.vivy.app.shared.vm.BaseViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val loginModule = module {
    viewModel { LoginVm(get()) }
}

class LoginVm(dataManager: DataManager)
    : BaseViewModel(dataManager)