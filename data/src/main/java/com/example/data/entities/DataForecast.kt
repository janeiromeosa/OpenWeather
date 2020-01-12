package com.example.data.entities
import com.google.gson.annotations.SerializedName


data class DataForecast(
    @SerializedName("city")
    val city: DataForecastCity,
    @SerializedName("cnt")
    val cnt: Int,
    @SerializedName("cod")
    val cod: String,
    @SerializedName("list")
    val list: List<DataForecastDate>,
    @SerializedName("message")
    val message: Double
)

data class DataForecastCity(
    @SerializedName("coord")
    val coord: DataForecastCoord,
    @SerializedName("country")
    val country: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)

data class DataForecastCoord(
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val lon: Double
)

data class DataForecastDate(
    @SerializedName("clouds")
    val clouds: DataForecastClouds,
    @SerializedName("dt")
    val dt: Int,
    @SerializedName("dt_txt")
    val dtTxt: String,
    @SerializedName("main")
    val main: DataForecastMain,
    @SerializedName("rain")
    val rain: DataForecastRain,
    @SerializedName("snow")
    val snow: DataForecastSnow,
    @SerializedName("sys")
    val sys: DataForecastSys,
    @SerializedName("weather")
    val weather: List<DataForecastWeather>,
    @SerializedName("wind")
    val wind: DataForecastWind
)

data class DataForecastClouds(
    @SerializedName("all")
    val all: Int
)

data class DataForecastMain(
    @SerializedName("grnd_level")
    val grndLevel: Double,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("pressure")
    val pressure: Double,
    @SerializedName("sea_level")
    val seaLevel: Double,
    @SerializedName("temp")
    val temp: Double,
    @SerializedName("temp_kf")
    val tempKf: Int,
    @SerializedName("temp_max")
    val tempMax: Double,
    @SerializedName("temp_min")
    val tempMin: Double
)

class DataForecastRain(
)

class DataForecastSnow(
)

data class DataForecastSys(
    @SerializedName("pod")
    val pod: String
)

data class DataForecastWeather(
    @SerializedName("description")
    val description: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("main")
    val main: String
)

data class DataForecastWind(
    @SerializedName("deg")
    val deg: Double,
    @SerializedName("speed")
    val speed: Double
)