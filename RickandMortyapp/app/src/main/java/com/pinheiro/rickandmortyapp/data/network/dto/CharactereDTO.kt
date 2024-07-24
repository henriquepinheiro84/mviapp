package com.pinheiro.rickandmortyapp.data.network.dto

import com.google.gson.annotations.SerializedName

data class CharactereDTO(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("")
    val gender: String,
    @SerializedName("origin")
    val origin: OriginDTO,
    @SerializedName("location")
    val location: LocationDTO,
    @SerializedName("image")
    val image: String,
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("url")
    val url: String,
    @SerializedName("created")
    val created: String
)
