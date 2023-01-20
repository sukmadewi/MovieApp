package com.example.movieapp.di

import com.example.movieapp.core.domain.usecase.movie.MovieInteractor
import com.example.movieapp.core.domain.usecase.movie.MovieUseCase
import com.example.movieapp.ui.movie.MovieViewModel
import com.example.movieapp.ui.tvshow.TvShowViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
    viewModel { TvShowViewModel(get()) }
}