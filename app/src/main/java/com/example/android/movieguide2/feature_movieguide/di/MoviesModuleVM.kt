package com.example.android.movieguide2.feature_movieguide.di

import com.example.android.movieguide2.feature_movieguide.data.remote.MovieGuideApi
import com.example.android.movieguide2.feature_movieguide.data.repository.MoviesRepository
import com.example.android.movieguide2.feature_movieguide.data.repository.MoviesRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

//
//@Module
//@InstallIn(ViewModelComponent::class)
//object MoviesModuleVM {
//
//    @Provides
//    @ViewModelScoped
//    fun provideMoviesRepository(api: MovieGuideApi): MoviesRepository {
//        return MoviesRepositoryImpl(api)
//    }
//
//
//    @Provides
//    @ViewModelScoped
//    fun providesMovieGuideApi(): MovieGuideApi {
//        return Retrofit.Builder()
//            .baseUrl(MovieGuideApi.BASE_URL)
//            .addConverterFactory(MoshiConverterFactory.create(MovieGuideApi.moshi))
//            .build()
//            .create(MovieGuideApi::class.java)
//
//    }
//}