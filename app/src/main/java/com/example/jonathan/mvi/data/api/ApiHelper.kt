package com.example.jonathan.mvi.data.api

import com.example.jonathan.mvi.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>

}