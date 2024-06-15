package ru.kmept.kormezhka

import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.Call

interface ApiService {
    @POST("log/")
    fun logUser(@Body user: User): Call<LogInResponse>
}