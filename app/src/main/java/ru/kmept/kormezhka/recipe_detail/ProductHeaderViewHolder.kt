package ru.kmept.kormezhka.recipe_detail

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.kmept.kormezhka.R

class ProductHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val foodTextView: TextView
    val timeTextView: TextView
    val avatarImageView: ImageView
    val nameTextView: TextView
    val likeTextView: TextView
    val discipView : TextView
    init {
        foodTextView = itemView.findViewById(R.id.foodName)
        timeTextView = itemView.findViewById(R.id.time)
        avatarImageView = itemView.findViewById(R.id.avatar)
        nameTextView = itemView.findViewById(R.id.name)
        likeTextView = itemView.findViewById(R.id.like)
        discipView = itemView.findViewById(R.id.description)
    }

}
