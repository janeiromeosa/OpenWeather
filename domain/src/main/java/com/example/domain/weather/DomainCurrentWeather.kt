package com.example.domain.weather

data class DomainCurrentWeather(
    val payload: List<DomainCurrentWeatherPayload> = emptyList()
)

data class DomainCurrentWeatherPayload(
    val base: String = "",
    val clouds: DomainCurrentClouds = DomainCurrentClouds(),
    val cod: Int = Int.MIN_VALUE,
    val coord: DomainCurrentCoord = DomainCurrentCoord(),
    val dt: Int = Int.MIN_VALUE,
    val id: Int = Int.MIN_VALUE,
    val main: DomainCurrentMain = DomainCurrentMain(),
    val name: String = "",
    val sys: DomainCurrentSys = DomainCurrentSys(),
    val timezone: Int = Int.MIN_VALUE,
    val visibility: Int = Int.MIN_VALUE,
    val weather: List<DomainCurrentWeatherList> = emptyList(),
    val wind: DomainCurrentWind = DomainCurrentWind()
)

data class DomainCurrentClouds(
    val all: Int = Int.MIN_VALUE
)

data class DomainCurrentCoord(
    val lat: Double = Double.MIN_VALUE,
    val lon: Double = Double.MIN_VALUE
)

data class DomainCurrentMain(
    val feelsLike: Double = Double.MIN_VALUE,
    val humidity: Int = Int.MIN_VALUE,
    val pressure: Int = Int.MIN_VALUE,
    val temp: Double = Double.MIN_VALUE,
    val tempMax: Double = Double.MIN_VALUE,
    val tempMin: Double = Double.MIN_VALUE
)

data class DomainCurrentSys(
    val country: String = "",
    val id: Int = Int.MIN_VALUE,
    val message: Double = Double.MIN_VALUE,
    val sunrise: Int = Int.MIN_VALUE,
    val sunset: Int = Int.MIN_VALUE,
    val type: Int = Int.MIN_VALUE
)

data class DomainCurrentWeatherList(
    val description: String = "",
    val icon: String = "",
    val id: Int = Int.MIN_VALUE,
    val main: String = ""
)

data class DomainCurrentWind(
    val deg: Int = Int.MIN_VALUE,
    val speed: Double = Double.MIN_VALUE
)