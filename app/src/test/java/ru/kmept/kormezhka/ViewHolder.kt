package ru.kmept.kormezhkaimport android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val avatarImageView: ImageView
    val nameTextView: TextView
    init {
        avatarImageView = itemView.findViewById(R.id.avatarImageView)
        nameTextView = itemView.findViewById(R.id.nameTextView)
    }
}