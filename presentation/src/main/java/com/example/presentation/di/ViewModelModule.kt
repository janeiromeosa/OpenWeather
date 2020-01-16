package com.example.presentation.di

import com.example.presentation.currentweather.CurrentWeatherViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModels = module {

    viewModel {
        CurrentWeatherViewModel(currentWeatherUseCase = get(GET_WEATHER_USE_CASE), mapper = get(UI_CURRENT_WEATHER_MAPPER))
    }
}
