package com.example.data.mappers

import com.example.data.entities.*
import com.example.domain.common.Mapper
import com.example.domain.weather.*

class WeatherMapper : Mapper<DataCurrentWeather, DomainCurrentWeather> {
    

//    override fun map(from: DataCurrentWeather): DomainCurrentWeather = DomainCurrentWeather(
//        payload = from.payload?.map { toDataServicesPayload(it)  }?: emptyList()
//    )

    override fun map(from: DataCurrentWeather): DomainCurrentWeather = DomainCurrentWeather (
        base = from.base,
        clouds = toDomainServicesClouds(from.clouds),
        cod = from.cod,
        coord = toDomainServicesCoord(from.coord),
        dt = from.dt,
        id = from.id,
        main = toDomainServicesMain(from.main),
        name = from.name,
        sys = toDomainSys(from.sys),
        timezone = from.timezone,
        visibility = from.visibility,
        weather = from.weather?.map{toDomainWeather(it)},
        wind = toDomainWind(from.wind)
    )

    private fun toDomainWeather(it: DataCurrentWeatherList): DomainCurrentWeatherList = DomainCurrentWeatherList(
        description = it.description,
        icon = it.icon,
        id = it.id,
        main = it.main
    )

    private fun toDomainWind(wind: DataCurrentWind?): DomainCurrentWind? = DomainCurrentWind(
        deg = wind?.deg,
        speed =  wind?.speed
    )

    private fun toDomainSys(sys: DataCurrentSys?): DomainCurrentSys? = DomainCurrentSys(
        country = sys?.country,
        id = sys?.id,
        message = sys?.message,
        sunrise = sys?.sunrise,
        sunset = sys?.sunset,
        type = sys?.type
    )

    private fun toDomainServicesMain(main: DataCurrentMain?): DomainCurrentMain? = DomainCurrentMain(
        feelsLike = main?.feelsLike,
        humidity = main?.humidity,
        pressure = main?.pressure,
        temp = main?.temp,
        tempMax = main?.tempMax,
        tempMin = main?.tempMin
    )

    private fun toDomainServicesCoord(coord: DataCurrentCoord?): DomainCurrentCoord? = DomainCurrentCoord(
        lat = coord?.lat,
        lon = coord?.lon
    )

    private fun toDomainServicesClouds(clouds: DataCurrentClouds?): DomainCurrentClouds = DomainCurrentClouds(
        all = clouds?.all
    )
    


}