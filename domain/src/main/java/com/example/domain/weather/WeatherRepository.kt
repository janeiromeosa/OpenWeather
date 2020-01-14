package com.example.domain.weather

import io.reactivex.Single

interface WeatherRepository {
    fun getCurrentWeather(cityName: String, appid: String): Single<DomainCurrentWeather>
    fun getForecast(cityName: String, appid: String): Single<DomainCurrentWeather>

}