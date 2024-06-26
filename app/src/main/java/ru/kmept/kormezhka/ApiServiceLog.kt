package ru.kmept.kormezhka

import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.Call

interface ApiServiceLog {
    @POST("log/")
    fun logUser(@Body userLog: UserLog): Call<LogInResponse>
}