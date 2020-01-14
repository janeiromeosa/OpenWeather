package com.example.data.repository

import com.example.data.datastore.WeatherRemoteDataStore
import com.example.data.entities.DataCurrentWeather
import com.example.data.mappers.WeatherMapper
import com.example.domain.common.Mapper
import com.example.domain.weather.DomainCurrentWeather
import com.example.domain.weather.WeatherRepository
import io.reactivex.Single

class WeatherRepositoryImpl(
    private val remote: WeatherRemoteDataStore,
    private val weatherMapper: Mapper<DataCurrentWeather, DomainCurrentWeather>
): WeatherRepository{
    override fun getCurrentWeather(cityName: String, appid: String): Single<DomainCurrentWeather> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getForecast(cityName: String, appid: String): Single<DomainCurrentWeather> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}