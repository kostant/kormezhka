package ru.kmept.kormezhka

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientLog {
    private const val Base_URL = "http://pargevdotnet.ru/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Base_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiServiceLog: ApiServiceLog by lazy {
        retrofit.create(ApiServiceLog::class.java)
    }
}