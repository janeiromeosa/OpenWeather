package com.example.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.data.entities.DataCurrentWeather
import io.reactivex.Single

@Dao
interface WeatherDao {
    @Query("SELECT * FROM room_master_table")
    fun getAll(): Single<DataCurrentWeather>

    @Insert
    fun insertAll(vararg dataCurrentWeather: DataCurrentWeather)

    @Delete
    fun delete(dataCurrentWeather: DataCurrentWeather)
}