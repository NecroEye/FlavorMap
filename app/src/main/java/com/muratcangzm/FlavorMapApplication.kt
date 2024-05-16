package com.muratcangzm

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FlavorMapApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }

}