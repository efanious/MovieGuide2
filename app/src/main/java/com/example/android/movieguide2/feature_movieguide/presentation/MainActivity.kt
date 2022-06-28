package com.example.android.movieguide2.feature_movieguide.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.movieguide2.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterButton = findViewById<Button>(R.id.enter_btn)
        enterButton.setOnClickListener {
            val intent = Intent(
                this,
                HomeActivity::class.java
            )
            startActivity(intent)
        }
    }
}