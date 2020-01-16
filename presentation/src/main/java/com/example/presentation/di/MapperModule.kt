package com.example.presentation.di

import com.example.data.entities.DataCurrentWeather
import com.example.data.mappers.WeatherMapper
import com.example.domain.common.Mapper
import com.example.domain.weather.DomainCurrentWeather
import com.example.presentation.currentweather.UICurrentWeather
import com.example.presentation.currentweather.UICurrentWeatherMapper
import org.koin.dsl.module.module

val mappers = module {
    single(name = DOMAIN_CURRENT_WEATHER_MAPPER) { WeatherMapper() as Mapper<DataCurrentWeather, DomainCurrentWeather> }
    single(name = UI_CURRENT_WEATHER_MAPPER) { UICurrentWeatherMapper() as Mapper<DomainCurrentWeather, UICurrentWeather> }


}
