package com.example.presentation.di

import com.example.domain.weather.CurrentWeatherUseCase
import org.koin.dsl.module.module

val useCaseModules = module {

    factory(GET_WEATHER_USE_CASE){CurrentWeatherUseCase(threadScheduler = get(), weatherRepository = get()) }
}
