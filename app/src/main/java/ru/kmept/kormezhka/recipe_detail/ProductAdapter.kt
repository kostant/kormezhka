package ru.kmept.kormezhka.recipe_detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.kmept.kormezhka.R
import ru.kmept.kormezhka.data.model.Recipe

class ProductAdapter : RecyclerView.Adapter<ProductHeaderViewHolder>() {
    var recipe: Recipe? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHeaderViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_name, parent, false)
        return ProductHeaderViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: ProductHeaderViewHolder, position: Int) {
        val recipe = recipe
        if (recipe != null) {
            holder.foodTextView.setText(recipe.name)
            holder.timeTextView.setText(recipe.duration.toString())
            holder.nameTextView.text = recipe.author.name
            holder.likeTextView.setText(recipe.likesCount.toString())
        }
    }

}