package ru.kmept.kormezhka.recipe_detail

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ru.kmept.kormezhka.R
import ru.kmept.kormezhka.data.RecipesRepository

class RecipeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
        val AvatarImage = findViewById<ImageView>(R.id.avatar)
        val pictureimageView = findViewById<ImageView>(R.id.image_view)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        val adapter = ProductAdapter()
        recyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val id = intent.getIntExtra("id",1)

        RecipesRepository.global.getById(id

        ) {
            adapter.recipe = it
            it.pictureUrl


            Picasso.get()
                .load(it.pictureUrl)
                .into(pictureimageView)


            //pictureimageView.setImageResource()

            adapter.notifyDataSetChanged()
        }
    }
}