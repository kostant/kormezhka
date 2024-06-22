package ru.kmept.kormezhka

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("reg/")
    fun createUser(@Body user: User): Call<RegistrationResponse>
}