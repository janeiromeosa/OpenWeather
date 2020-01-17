package com.example.presentation.di

import com.example.data.datastore.WeatherDataSource
import com.example.data.datastore.WeatherRemoteDataStore
import org.koin.dsl.module.module

val dataStoreModules = module {
    single <WeatherDataSource>{ WeatherRemoteDataStore(get()) }

}