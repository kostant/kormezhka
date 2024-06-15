package ru.kmept.kormezhka

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchHistoryItemViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)
{

    val avatarImageView: ImageView
    val avatar2ImageView: ImageView
    val nameTextView: TextView
    fun SetText (Text:String)
    {
        nameTextView.setText(Text)
    }
    init {
        avatarImageView = itemView.findViewById(R.id.avatarImageView)
        avatar2ImageView = itemView.findViewById(R.id.avatar2ImageView)
        nameTextView = itemView.findViewById(R.id.nameTextView)
    }

}