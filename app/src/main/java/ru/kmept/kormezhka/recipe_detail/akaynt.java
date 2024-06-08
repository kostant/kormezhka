package ru.kmept.kormezhka.recipe_detail;

public class akaynt {
    class UserViewHolder(itemView: View) : ViewHolder(itemView) {
        val avatarImageView: ImageView
        val nameTextView: TextView
        init {
            avatarImageView = itemView.findViewById(R.id.avatarImageView)
            nameTextView = itemView.findViewById(R.id.nameTextView)
        }
    }
}
