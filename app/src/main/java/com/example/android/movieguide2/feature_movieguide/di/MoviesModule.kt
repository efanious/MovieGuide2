package com.example.android.movieguide2.feature_movieguide.di

import com.example.android.movieguide2.feature_movieguide.data.remote.MovieGuideApi
import com.example.android.movieguide2.feature_movieguide.data.repository.MoviesRepository
import com.example.android.movieguide2.feature_movieguide.data.repository.MoviesRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviesModule {

//    @Provides
//    @Singleton
//    fun provideMoviesRepository(api: MovieGuideApi): MoviesRepository {
//        return MoviesRepositoryImpl(api)
//    }

//    val interceptor = HttpLoggingInterceptor()
//
//    val builder = OkHttpClient().newBuilder()
//        .addInterceptor(interceptor.apply {
//            interceptor.level = HttpLoggingInterceptor.Level.BODY
//        })
//        .build()
//
//
//    private val retrofit = Retrofit.Builder()
//        .addConverterFactory(MoshiConverterFactory.create(moshi))
//        .baseUrl(BASE_URL)
//        .client(builder)
//        .build()

//    private val moshi = Moshi.Builder()
//        .add(KotlinJsonAdapterFactory())
//        .build()

//    @Provides
//    @Singleton
//    fun providesMovieGuideApi(): MovieGuideApi {
//        return Retrofit.Builder()
//            .baseUrl(MovieGuideApi.BASE_URL)
//            .addConverterFactory(MoshiConverterFactory.create(moshi))
//            .build()
//            .create(MovieGuideApi::class.java)
//    }
}


