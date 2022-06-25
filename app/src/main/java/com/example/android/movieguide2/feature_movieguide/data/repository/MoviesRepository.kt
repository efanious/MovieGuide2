package com.example.android.movieguide2.feature_movieguide.data.repository

import com.example.android.movieguide2.feature_movieguide.data.remote.dto.TrendingMoviesResponse

interface MoviesRepository {

    suspend fun getTrendingMovies(): TrendingMoviesResponse
}