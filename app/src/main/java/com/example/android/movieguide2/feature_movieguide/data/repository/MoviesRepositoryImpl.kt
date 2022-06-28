package com.example.android.movieguide2.feature_movieguide.data.repository

import com.example.android.movieguide2.feature_movieguide.data.remote.MovieGuideApi
import com.example.android.movieguide2.feature_movieguide.data.remote.dto.TrendingMoviesResponse
import javax.inject.Inject


class MoviesRepositoryImpl @Inject constructor(private val movieGuideApi: MovieGuideApi) :
    MoviesRepository {

    override suspend fun getTrendingMovies(): TrendingMoviesResponse {
        return movieGuideApi.getTrendingMovies()
    }
}