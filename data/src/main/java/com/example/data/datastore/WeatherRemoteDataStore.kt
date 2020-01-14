package com.example.data.datastore

import com.example.data.api.WeatherApi
import com.example.data.entities.DataCurrentWeather
import io.reactivex.Single

class WeatherRemoteDataStore constructor(private val api: WeatherApi): WeatherDataSource {

    override fun getCurrentWeather(cityName: String, appid: String): Single<DataCurrentWeather>
            = api.getCurrentWeather(cityName, appid)

}