package com.example.presentation.currentweather

data class UICurrentWeather(

    val base: String? = null,
    val clouds: UICurrentClouds? = null,
    val cod: Int? = null,
    val coord: UICurrentCoord? = null,
    val dt: Int? = null,
    val id: Int? = null,
    val main: UICurrentMain? = null,
    val name: String? = null,
    val sys: UICurrentSys? = null,
    val timezone: Int? = null,
    val visibility: Int? = null,
    val weather: List<UICurrentWeatherList>? = null,
    val wind: UICurrentWind? = null
)

data class UICurrentClouds(
    val all: Int? = null
)

data class UICurrentCoord(
    val lat: Double? = null,
    val lon: Double? = null
)

data class UICurrentMain(
    val feelsLike: Double? = null,
    val humidity: Int? = null,
    val pressure: Int? = null,
    val temp: Double? = null,
    val tempMax: Double? = null,
    val tempMin: Double? = null
)

data class UICurrentSys(
    val country: String? = null,
    val id: Int? = null,
    val message: Double? = null,
    val sunrise: Int? = null,
    val sunset: Int? = null,
    val type: Int? = null
)

data class UICurrentWeatherList(
    val description: String? = null,
    val icon: String? = null,
    val id: Int? = null,
    val main: String? = null
)

data class UICurrentWind(
    val deg: Int? = null,
    val speed: Double? = null
)