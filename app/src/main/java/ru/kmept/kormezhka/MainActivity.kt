package ru.kmept.kormezhka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.kmept.kormezhka.data.RecipesRepository
import ru.kmept.kormezhka.data.model.Recipe

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RecipesRepository.global.getFoodRecipes {
            updateScreenWithRecipes(it)
        }
    }

    fun updateScreenWithRecipes(recipes: Array<Recipe>) {
        // Обновить экран используя рецепты из массива recipes
    }
}