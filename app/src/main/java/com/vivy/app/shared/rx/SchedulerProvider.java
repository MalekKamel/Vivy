package com.vivy.app.shared.rx;

import io.reactivex.Scheduler;

/**
 * Created by @TallShahawi on 12/26/17
 */

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();

}
