package com.example.data.repository

import com.example.data.database.WeatherLocalDataStore
import com.example.data.database.WeatherPersistence
import com.example.data.datastore.WeatherRemoteDataStore
import com.example.data.entities.DataCurrentWeather
import com.example.data.mappers.WeatherMapper
import com.example.domain.common.Mapper
import com.example.domain.weather.DomainCurrentWeather
import com.example.domain.weather.WeatherRepository
import io.reactivex.Single

class WeatherRepositoryImpl(
    private val remote: WeatherRemoteDataStore,
    private val local: WeatherLocalDataStore,
    private val weatherMapper: Mapper<DataCurrentWeather, DomainCurrentWeather>
): WeatherRepository, WeatherRepository.Persistence{

    override fun getLocalCurrentWeather(cityName: String, appid: String): Single<DomainCurrentWeather> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun storeLocalCurrentWeather(domainCurrentWeather: DomainCurrentWeather) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getCurrentWeather(cityName: String, appid: String): Single<DomainCurrentWeather> {
        return remote.getCurrentWeather(cityName, appid).map { weatherMapper.map(it) }
//            .doOnSubscribe{this::storeLocalCurrentWeather}
//            .onErrorResumeNext {local.getLocalCurrentWeather()  }
    }

}