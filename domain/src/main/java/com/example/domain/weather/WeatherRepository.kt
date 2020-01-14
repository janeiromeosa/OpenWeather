package com.example.domain.weather

import io.reactivex.Single

interface WeatherRepository {
    fun getCurrentWeather(cityName: String, appid: String): Single<DomainCurrentWeather>

    interface Persistence{
        fun getLocalCurrentWeather(cityName: String, appid: String): Single<DomainCurrentWeather>
        fun storeLocalCurrentWeather(domainCurrentWeather: DomainCurrentWeather)
    }
}
