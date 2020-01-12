package com.example.data.entities
import com.google.gson.annotations.SerializedName


data class DataCurrentWeather(
    @SerializedName("base")
    val base: String,
    @SerializedName("clouds")
    val clouds: DataCurrentClouds,
    @SerializedName("cod")
    val cod: Int,
    @SerializedName("coord")
    val coord: DataCurrentCoord,
    @SerializedName("dt")
    val dt: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("main")
    val main: DataCurrentMain,
    @SerializedName("name")
    val name: String,
    @SerializedName("sys")
    val sys: DataCurrentSys,
    @SerializedName("timezone")
    val timezone: Int,
    @SerializedName("visibility")
    val visibility: Int,
    @SerializedName("weather")
    val weather: List<DataCurrentWeatherList>,
    @SerializedName("wind")
    val wind: DataCurrentWind
)

data class DataCurrentClouds(
    @SerializedName("all")
    val all: Int
)

data class DataCurrentCoord(
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val lon: Double
)

data class DataCurrentMain(
    @SerializedName("feels_like")
    val feelsLike: Double,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("pressure")
    val pressure: Int,
    @SerializedName("temp")
    val temp: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    @SerializedName("temp_min")
    val tempMin: Double
)

data class DataCurrentSys(
    @SerializedName("country")
    val country: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("message")
    val message: Double,
    @SerializedName("sunrise")
    val sunrise: Int,
    @SerializedName("sunset")
    val sunset: Int,
    @SerializedName("type")
    val type: Int
)

data class DataCurrentWeatherList(
    @SerializedName("description")
    val description: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("main")
    val main: String
)

data class DataCurrentWind(
    @SerializedName("deg")
    val deg: Int,
    @SerializedName("speed")
    val speed: Double
)