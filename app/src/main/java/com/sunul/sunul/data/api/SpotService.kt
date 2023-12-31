package com.sunul.sunul.data.api

import com.sunul.sunul.data.model.response.ResponseMbtiChat
import com.sunul.sunul.data.model.response.ResponseSpots
import retrofit2.http.GET
import retrofit2.http.Path

interface SpotService {
    @GET("/spot/{mbti}")
    suspend fun getSpots(
        @Path("mbti") mbti: String,
    ): ResponseSpots

    @GET("/spot/{mbti}/chat")
    suspend fun getSpotChat(
        @Path("mbti") mbti: String,
    ): ResponseMbtiChat
}