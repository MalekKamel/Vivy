package com.vivy.app.shared.data

import com.vivy.app.shared.network.ApiRepository
import com.vivy.app.shared.rx.SchedulerProvider
import com.vivy.app.shared.util.SharedPref

open class DataManager(
        val pref: SharedPref,
        val api: ApiRepository,
        val schedulerProvider: SchedulerProvider
)
