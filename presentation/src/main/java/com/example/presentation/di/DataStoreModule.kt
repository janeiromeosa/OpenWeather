package com.example.presentation.di

import com.example.data.datastore.WeatherRemoteDataStore
import com.example.domain.common.ThreadScheduler
import com.example.presentation.common.extentions.RxScheduler
import org.koin.dsl.module.module

val dataStoreModules = module {
    single{ WeatherRemoteDataStore(get()) }
}

val schedulerModule = module {
    single<ThreadScheduler>{ RxScheduler() }
}