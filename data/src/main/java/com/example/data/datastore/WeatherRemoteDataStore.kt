package com.example.data.datastore

import com.example.data.api.WeatherApi
import com.example.data.entities.DataCurrentWeather
import io.reactivex.Single

class WeatherRemoteDataStore constructor(private val api: WeatherApi): WeatherDataStore {

    override fun getCurrentWeather(cityName: String, appid: String): Single<DataCurrentWeather>
            = api.getCurrentWeather(cityName, appid)

    override fun getForecast(cityName: String, appid: String): Single<DataCurrentWeather>
            = api.getForecast(cityName, appid)


}