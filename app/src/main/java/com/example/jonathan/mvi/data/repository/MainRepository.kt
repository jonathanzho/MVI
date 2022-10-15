package com.example.jonathan.mvi.data.repository

import com.example.jonathan.mvi.data.api.ApiHelper


class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

}