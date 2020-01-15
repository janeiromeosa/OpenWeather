package com.example.presentation.currentweather

data class UICurrentWeather (
        val payload: List<UICurrentWeatherPayload>
    )

    data class UICurrentWeatherPayload(
        val base: String,
        val clouds: UICurrentClouds,
        val cod: Int,
        val coord: UICurrentCoord,
        val dt: Int,
        val id: Int,
        val main: UICurrentMain,
        val name: String,
        val sys: UICurrentSys,
        val timezone: Int,
        val visibility: Int,
        val weather: List<UICurrentWeatherList>,
        val wind: UICurrentWind
    )

    data class UICurrentClouds(
        val all: Int
    )

    data class UICurrentCoord(
        val lat: Double,
        val lon: Double
    )

    data class UICurrentMain(
        val feelsLike: Double,
        val humidity: Int,
        val pressure: Int,
        val temp: Double,
        val tempMax: Double,
        val tempMin: Double
    )

    data class UICurrentSys(
        val country: String,
        val id: Int,
        val message: Double,
        val sunrise: Int,
        val sunset: Int,
        val type: Int
    )

    data class UICurrentWeatherList(
        val description: String,
        val icon: String,
        val id: Int,
        val main: String
    )

    data class UICurrentWind(
        val deg: Int,
        val speed: Double
    )
