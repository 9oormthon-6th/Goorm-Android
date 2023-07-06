package com.sunul.sunul.data.api

import com.sunul.sunul.data.model.response.ResponseQnA
import retrofit2.http.GET
import retrofit2.http.Path

interface OnBoardingService {
    @GET("/mbti/{qid}")
    suspend fun getQnA(
        @Path("qid") qid: String,
    ): ResponseQnA
}