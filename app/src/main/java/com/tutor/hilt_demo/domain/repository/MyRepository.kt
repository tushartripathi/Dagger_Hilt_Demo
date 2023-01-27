package com.tutor.hilt_demo.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}