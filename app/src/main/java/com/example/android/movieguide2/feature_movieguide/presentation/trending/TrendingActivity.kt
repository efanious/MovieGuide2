package com.example.android.movieguide2.feature_movieguide.presentation.trending

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.android.movieguide2.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class TrendingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trending)

        val viewModel: TrendingViewModel =
            ViewModelProvider(this)[TrendingViewModel::class.java]


        viewModel.getTrendingMovies()

        viewModel.response.observe(this) {
            Toast.makeText(this@TrendingActivity, "${ it.results?.size ?:"Empty"  }", Toast.LENGTH_SHORT).show()
        }

    }
}