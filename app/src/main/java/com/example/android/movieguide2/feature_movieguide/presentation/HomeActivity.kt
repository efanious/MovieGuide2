package com.example.android.movieguide2.feature_movieguide.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.movieguide2.R
import dagger.hilt.android.AndroidEntryPoint


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}