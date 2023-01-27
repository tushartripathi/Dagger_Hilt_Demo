package com.tutor.hilt_demo.data.repository

import com.tutor.hilt_demo.data.remote.MyAPi
import com.tutor.hilt_demo.domain.repository.MyRepository

class MyRespositoryImpl(
    private val api : MyAPi
) : MyRepository  {
    override suspend fun doNetworkCall() {

    }
}