package com.example.android.movieguide2.feature_movieguide.presentation.trending

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.movieguide2.feature_movieguide.data.remote.dto.TrendingMoviesResponse
import com.example.android.movieguide2.feature_movieguide.data.repository.MoviesRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject


//@HiltViewModel
//@Inject constructor
class TrendingViewModel (private val moviesRepositoryImpl: MoviesRepositoryImpl) :
    ViewModel() {

    private val _response = MutableLiveData<TrendingMoviesResponse>()

    val response: LiveData<TrendingMoviesResponse>
        get() = _response

    private val _errorResponse = MutableLiveData<String>()

    val errorResponse: LiveData<String>
        get() = _errorResponse


    fun getTrendingMovies() {

        viewModelScope.launch {
            try {
                //_eventNetworkError.value = false
                _response.value = moviesRepositoryImpl.getTrendingMovies()

            } catch (e: Exception) {
                //_eventNetworkError.value = true
                _errorResponse.value = e.message

            }
        }
    }

}