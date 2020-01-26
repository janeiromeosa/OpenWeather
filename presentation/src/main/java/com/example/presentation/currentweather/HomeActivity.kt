package com.example.presentation.currentweather

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.presentation.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class HomeActivity : AppCompatActivity(){

    private val currentWeatherViewModel: CurrentWeatherViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        currentWeatherViewModel.getContentObservable().observe(this, Observer {
            tv_temperature.text = it.main?.temp.toString()
            tv_weather_description.text = it.weather?.get(0)?.description ?:""
            tv_humidity_percentage.text = it.main?.humidity.toString()
            tv_last_update.text = it.dt.toString()
            tv_temperature_min.text = it.main?.tempMin.toString()
            tv_temperature_max.text = it.main?.tempMax.toString()

        })
        currentWeatherViewModel.getErrorObserable().observe(this, Observer {
            Toast.makeText(this,it, Toast.LENGTH_LONG).show()
        })
    }

    override fun onStart() {
        super.onStart()

        currentWeatherViewModel.getWeatherInfo()
    }
}