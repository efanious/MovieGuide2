package com.example.android.movieguide2

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MovieGuideApp: Application(){
    override fun onCreate() {
        super.onCreate()
    }
}