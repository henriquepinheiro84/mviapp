package com.pinheiro.rickandmortyapp.data.network

import com.pinheiro.rickandmortyapp.data.network.dto.CharactereDTO
import com.pinheiro.rickandmortyapp.data.util.Constants
import retrofit2.http.GET

interface RickAndMortyApi {

    @GET(Constants.CHARACTERE_ENDPOINT)
    suspend fun getCharacters() : CharactereDTO
    @GET(Constants.LOCATION_ENDPOINT)
    suspend fun getLocations() : CharactereDTO
    @GET(Constants.EPISODE_ENDPOINT)
    suspend fun getEpisodes() : CharactereDTO
}