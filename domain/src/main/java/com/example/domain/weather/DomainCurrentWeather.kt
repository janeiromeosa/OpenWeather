package com.example.domain.weather

data class DomainCurrentWeather(
   val payload: List<DomainCurrentWeatherPayload>? = null
)

data class DomainCurrentWeatherPayload(
    
    val base: String? = null,
    val clouds: DomainCurrentClouds? = null,
    val cod: Int? = null,
    val coord: DomainCurrentCoord? = null,
    val dt: Int? = null,
    val id: Int? = null,
    val main: DomainCurrentMain? = null,
    val name: String? = null,
    val sys: DomainCurrentSys? = null,
    val timezone: Int? = null,
    val visibility: Int? = null,
    val weather: List<DomainCurrentWeatherList>? = null,
    val wind: DomainCurrentWind? = null
)

data class DomainCurrentClouds(
    val all: Int? = null
)

data class DomainCurrentCoord(
    val lat: Double? = null,
    val lon: Double? = null
)

data class DomainCurrentMain(
    val feelsLike: Double? = null,
    val humidity: Int? = null,
    val pressure: Int? = null,
    val temp: Double? = null,
    val tempMax: Double? = null,
    val tempMin: Double? = null
)

data class DomainCurrentSys(
    val country: String? = null,
    val id: Int? = null,
    val message: Double? = null,
    val sunrise: Int? = null,
    val sunset: Int? = null,
    val type: Int? = null
)

data class DomainCurrentWeatherList(
    val description: String? = null,
    val icon: String? = null,
    val id: Int? = null,
    val main: String? = null
)

data class DomainCurrentWind(
    val deg: Int? = null,
    val speed: Double? = null
)