package com.example.harryporterapi_jetpackcompose.data.repository

import com.example.harryporterapi_jetpackcompose.data.api.CharacterApi
import com.example.harryporterapi_jetpackcompose.data.api.model.Character
import javax.inject.Inject

class CharacterRepo @Inject constructor(
    private val characterApi: CharacterApi
) {
    suspend fun getCharacters(): List<Character> {
        return characterApi.getCharacter()
    }
}