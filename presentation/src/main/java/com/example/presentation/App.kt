package com.example.presentation

import android.app.Application
import com.example.presentation.di.*
import org.koin.android.ext.android.startKoin
import org.koin.android.logger.AndroidLogger

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        loadKoin(this)
    }

    private fun loadKoin(application: Application) {
        application.startKoin(application,
            listOf(
                networkModules,
                viewModels,
                repositoryModules,
                useCaseModules,
                mappers,
                dataStoreModules
            ),
            logger = AndroidLogger()
        )
    }
}