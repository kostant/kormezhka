package ru.kmept.kormezhka.recipe_detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.kmept.kormezhka.R

class ProductAdapter : RecyclerView.Adapter<ProductHeaderViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHeaderViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_name, parent, false)
        return ProductHeaderViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ProductHeaderViewHolder, position: Int) {

    }

}