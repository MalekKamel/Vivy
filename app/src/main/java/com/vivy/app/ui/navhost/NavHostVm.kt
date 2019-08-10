package com.vivy.app.ui.navhost

import com.vivy.app.shared.data.DataManager
import com.vivy.app.shared.vm.BaseViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Sha on 9/15/17.
 */

val navHostModule = module {
    viewModel { NavHostVm(get()) }
}

class NavHostVm(dataManager: DataManager)
    : BaseViewModel(dataManager) {

}