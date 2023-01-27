package com.tutor.hilt_demo.data.remote

import retrofit2.http.GET

interface MyAPi {

    //get request
    @GET("test")
    suspend fun doNetworkCall()
}