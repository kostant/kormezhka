package ru.kmept.kormezhka

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val foodTextView: TextView
    private val timeTextView: TextView
    private val avatarImageView: ImageView
    private val nameTextView: TextView
    private val likeTextView: TextView
    init {
        foodTextView = itemView.findViewById(R.id.foodName)
        timeTextView = itemView.findViewById(R.id.time)
        avatarImageView = itemView.findViewById(R.id.avatar)
        nameTextView = itemView.findViewById(R.id.name)
        likeTextView = itemView.findViewById(R.id.like)
    }

}