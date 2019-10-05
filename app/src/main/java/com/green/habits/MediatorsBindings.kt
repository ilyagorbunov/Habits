package com.green.habits

import com.green.core.mediator.MainMediator
import com.green.main.navigation.MainMediatorImpl
import dagger.Binds
import dagger.Module

@Module
interface MediatorsBindings {

    @Binds
    fun bindMainMediator(mainMediatorImpl: MainMediatorImpl): MainMediator
}