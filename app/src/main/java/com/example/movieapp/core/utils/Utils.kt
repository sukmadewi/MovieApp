package com.example.movieapp.core.utils

import com.example.movieapp.core.data.remote.response.MovieResponse
import com.example.movieapp.core.data.remote.response.TvShowResponse
import com.example.movieapp.core.domain.model.Movie
import com.example.movieapp.core.domain.model.TvShow

fun mapMovieResponseToDomain(input: MovieResponse) =
    Movie(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )

fun mapTvShowResponseToDomain(input: TvShowResponse) =
    TvShow(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )
