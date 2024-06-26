package ru.kmept.kormezhka.recipe_detail

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.kmept.kormezhka.R

class ViewHolder2 (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val avatarImageView: ImageView
    val nameTextView: TextView
    init {
        avatarImageView = itemView.findViewById(R.id.avatarImageView)
        nameTextView = itemView.findViewById(R.id.nameTextView)
    }
}
