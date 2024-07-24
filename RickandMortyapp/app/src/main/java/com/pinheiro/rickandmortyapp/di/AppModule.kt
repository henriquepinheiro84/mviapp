package com.pinheiro.rickandmortyapp.di

import com.google.gson.GsonBuilder
import com.pinheiro.rickandmortyapp.data.network.RickAndMortyApi
import com.pinheiro.rickandmortyapp.data.util.Constants
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    single<Retrofit> {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .baseUrl(Constants.BASE_URL)
            .build()
    }

    factory { provideRickAndMortyApi(get()) }

}

private fun provideRickAndMortyApi(retrofit: Retrofit) {
    retrofit.create(RickAndMortyApi::class.java)
}