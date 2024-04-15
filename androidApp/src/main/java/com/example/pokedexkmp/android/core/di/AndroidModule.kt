package com.example.pokedexkmp.android.core.di

import com.example.pokedexkmp.android.features.home.presentation.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeViewModelModule = module {
    viewModel<HomeViewModel> { HomeViewModel(get()) }
}
