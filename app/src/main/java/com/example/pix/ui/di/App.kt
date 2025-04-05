package com.example.pix.ui.di

import com.example.pix.data.flickr.FlickrApi
import com.example.pix.data.flickr.FlickrRepository
import com.example.pix.data.flickr.FlickrRetrofit
import com.example.pix.data.repos.PixRepository
import com.example.pix.domain.reposimpl.PixRepositoryImpl
import com.example.pix.ui.MainViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    single<FlickrApi>{FlickrRetrofit.api.value}
    single<FlickrRepository>{FlickrRepository(get())}
    single<PixRepository> {PixRepositoryImpl(get<FlickrRepository>()) }
    viewModelOf(::MainViewModel)
}