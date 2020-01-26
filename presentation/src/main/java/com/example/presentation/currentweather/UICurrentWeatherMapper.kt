package com.example.presentation.currentweather

import com.example.data.entities.*
import com.example.domain.common.Mapper
import com.example.domain.weather.*

class UICurrentWeatherMapper : Mapper<DomainCurrentWeather, UICurrentWeather> {

    override fun map(from: DomainCurrentWeather): UICurrentWeather = UICurrentWeather(
        base = from.base,
        clouds = toUIServicesClouds(from.clouds),
        cod = from.cod,
        coord = toUIServicesCoord(from.coord),
        dt = from.dt,
        id = from.id,
        main = toUIServicesMain(from.main),
        name = from.name,
        sys = toUISys(from.sys),
        timezone = from.timezone,
        visibility = from.visibility,
        weather = from.weather?.map{toUIWeather(it)},
        wind = toUIWind(from.wind)
    )

    private fun toUIWeather(it: DomainCurrentWeatherList): UICurrentWeatherList = UICurrentWeatherList(
        description = it.description,
        icon = it.icon,
        id = it.id,
        main = it.main
    )

    private fun toUIWind(wind: DomainCurrentWind?): UICurrentWind? = UICurrentWind(
        deg = wind?.deg,
        speed =  wind?.speed
    )

    private fun toUISys(sys: DomainCurrentSys?): UICurrentSys? = UICurrentSys(
        country = sys?.country,
        id = sys?.id,
        message = sys?.message,
        sunrise = sys?.sunrise,
        sunset = sys?.sunset,
        type = sys?.type
    )

    private fun toUIServicesMain(main: DomainCurrentMain?): UICurrentMain? = UICurrentMain(
        feelsLike = main?.feelsLike,
        humidity = main?.humidity,
        pressure = main?.pressure,
        temp = main?.temp,
        tempMax = main?.tempMax,
        tempMin = main?.tempMin
    )

    private fun toUIServicesCoord(coord: DomainCurrentCoord?): UICurrentCoord? = UICurrentCoord(
        lat = coord?.lat,
        lon = coord?.lon
    )

    private fun toUIServicesClouds(clouds: DomainCurrentClouds?): UICurrentClouds = UICurrentClouds(
        all = clouds?.all
    )



}