package com.example.data.datastore

import com.example.data.entities.DataCurrentWeather
import io.reactivex.Single

interface WeatherDataStore {
    fun getCurrentWeather(cityName: String, appid: String): Single<DataCurrentWeather>
    fun getForecast(cityName: String, appid: String): Single<DataCurrentWeather>
}