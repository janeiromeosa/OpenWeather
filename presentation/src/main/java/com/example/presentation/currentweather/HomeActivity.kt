package com.example.presentation.currentweather

import android.os.Bundle
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

    }

    override fun onStart() {
        super.onStart()
        currentWeatherViewModel.getContentObservable().observe(this, Observer {
            tv_temperature.text = it.payload?.get(0)?.weather?.get(0)?.description ?: ""
        })
        currentWeatherViewModel.getWeatherInfo()
    }
}