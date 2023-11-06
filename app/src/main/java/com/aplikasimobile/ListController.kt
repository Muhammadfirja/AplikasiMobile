package com.aplikasimobile

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitAPI {
    @GET("0677e3dd51b678c082c3")
    fun getQuiz(): Call<List<Modal>>
}
