package com.example.jonathan.mvi.data.api

import com.example.jonathan.mvi.data.model.User

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}