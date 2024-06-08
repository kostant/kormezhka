package ru.kmept.kormezhka.recipe_detail

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.kmept.kormezhka.R
import ru.kmept.kormezhka.data.RecipesRepository

class RecipeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        val adapter = ProductAdapter()
        recyclerView.adapter = adapter


        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = LinearLayoutManager(this)

        RecipesRepository.global.getById(1,{

        } )
    }
}