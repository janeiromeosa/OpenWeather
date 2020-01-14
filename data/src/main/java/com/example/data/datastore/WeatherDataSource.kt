package com.example.data.datastore

import com.example.data.entities.DataCurrentWeather
import io.reactivex.Single

interface WeatherDataSource {
    fun getCurrentWeather(cityName: String, appid: String): Single<DataCurrentWeather>

    interface Persistence{
        fun getLocalCurrentWeather(cityName: String, appid: String): Single<DataCurrentWeather>
        fun storeLocalCurrentWeather(dataCurrentWeather: DataCurrentWeather)
    }
}