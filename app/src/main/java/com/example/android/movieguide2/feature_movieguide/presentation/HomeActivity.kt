package com.example.android.movieguide2.feature_movieguide.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.movieguide2.R
import com.example.android.movieguide2.feature_movieguide.presentation.trending.TrendingActivity
import dagger.hilt.android.AndroidEntryPoint


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val trendingBtn = findViewById<Button>(R.id.trending_button)
        trendingBtn.setOnClickListener {
            val intent = Intent(
                this,
                TrendingActivity::class.java
            )
            startActivity(intent)
        }
    }
}