package com.example.data.entities
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomMasterTable.TABLE_NAME
import com.google.gson.annotations.SerializedName

data class DataCurrentWeather(
    @SerializedName("payload") val payload: List<DataCurrentWeatherPayload>? = null
)

@Entity(tableName = TABLE_NAME)
data class DataCurrentWeatherPayload(
    @PrimaryKey(autoGenerate = true)
    private var primaryKey: Int,

    @SerializedName("base")
    val base: String? = null,
    @SerializedName("clouds")
    val clouds: DataCurrentClouds? = null,
    @SerializedName("cod")
    val cod: Int? = null,
    @SerializedName("coord")
    val coord: DataCurrentCoord? = null,
    @SerializedName("dt")
    val dt: Int? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("main")
    val main: DataCurrentMain? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("sys")
    val sys: DataCurrentSys? = null,
    @SerializedName("timezone")
    val timezone: Int? = null,
    @SerializedName("visibility")
    val visibility: Int? = null,
    @SerializedName("weather")
    val weather: List<DataCurrentWeatherList>? = null,
    @SerializedName("wind")
    val wind: DataCurrentWind? = null
)

data class DataCurrentClouds(
    @SerializedName("all")
    val all: Int? = null
)

data class DataCurrentCoord(
    @SerializedName("lat")
    val lat: Double? = null,
    @SerializedName("lon")
    val lon: Double? = null
)

data class DataCurrentMain(
    @SerializedName("feels_like")
    val feelsLike: Double? = null,
    @SerializedName("humidity")
    val humidity: Int? = null,
    @SerializedName("pressure")
    val pressure: Int? = null,
    @SerializedName("temp")
    val temp: Double? = null,
    @SerializedName("temp_max")
    val tempMax: Double? = null,
    @SerializedName("temp_min")
    val tempMin: Double? = null
)

data class DataCurrentSys(
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("message")
    val message: Double? = null,
    @SerializedName("sunrise")
    val sunrise: Int? = null,
    @SerializedName("sunset")
    val sunset: Int? = null,
    @SerializedName("type")
    val type: Int? = null
)

data class DataCurrentWeatherList(
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("main")
    val main: String? = null
)

data class DataCurrentWind(
    @SerializedName("deg")
    val deg: Int? = null,
    @SerializedName("speed")
    val speed: Double? = null
)