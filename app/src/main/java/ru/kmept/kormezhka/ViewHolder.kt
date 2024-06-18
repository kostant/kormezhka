package ru.kmept.kormezhka

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val avatarImageView: ImageView

    val nameTextView: TextView
    fun SetText(Text:String)
    {
        nameTextView.setText(Text)
    }
    init {
        avatarImageView = itemView.findViewById(R.id.avatarImageView)

        nameTextView = itemView.findViewById(R.id.nameTextView)
    }

}