package com.example.presentation.di

import com.example.data.repository.WeatherRepositoryImpl
import com.example.domain.weather.WeatherRepository
import org.koin.dsl.module.module

val repositoryModules = module {

    single<WeatherRepository> {
        WeatherRepositoryImpl(
            remote = get(),
            weatherMapper = get(DOMAIN_CURRENT_WEATHER_MAPPER)
        )
    }
}