package com.example.data.database

import com.example.data.datastore.WeatherDataSource
import com.example.data.entities.DataCurrentWeather
import io.reactivex.Single

class WeatherLocalDataStore(private val local: WeatherPersistence) :
    WeatherDataSource.Persistence {

    override fun getLocalCurrentWeather(cityName: String, appid: String): Single<DataCurrentWeather> =
        local.getWeatherDao().getAll()

    override fun storeLocalCurrentWeather(dataCurrentWeather: DataCurrentWeather){
        local.getWeatherDao().insertAll()
    }

}