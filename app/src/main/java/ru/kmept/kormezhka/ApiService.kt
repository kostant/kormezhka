package ru.kmept.kormezhka
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.GET
import ru.kmept.kormezhka.data.model.RecipeDTO

interface ApiService {
    @POST("reg/")
    fun createUser(@Body user: User): Call<RegistrationResponse>
    
    @GET("get_all_recipe/")
    fun getData(): Call<Array<RecipeDTO>>
}