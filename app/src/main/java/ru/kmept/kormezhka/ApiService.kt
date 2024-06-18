package ru.kmept.kormezhka
import retrofit2.Call
import retrofit2.http.GET
import ru.kmept.kormezhka.data.model.RecipeDTO


interface ApiService {
    @GET("get_all_recipe/")
    fun getData(): Call<RecipeDTO>
}