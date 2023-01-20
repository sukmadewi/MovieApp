package com.example.movieapp.core.domain.repository

import com.example.movieapp.core.data.remote.Resource
import com.example.movieapp.core.domain.model.Movie
import com.example.movieapp.core.domain.model.TvShow
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    fun getMovies(): Flow<Resource<List<Movie>>>
    fun getTvShow(): Flow<Resource<List<TvShow>>>
}