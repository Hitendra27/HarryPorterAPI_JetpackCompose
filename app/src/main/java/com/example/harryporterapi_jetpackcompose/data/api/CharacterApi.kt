package com.example.harryporterapi_jetpackcompose.data.api

import com.example.harryporterapi_jetpackcompose.data.api.model.Character
import retrofit2.http.GET

interface CharacterApi {

    @GET(ApiConstants.END_POINT)
    suspend fun getCharacter():List<Character>
}