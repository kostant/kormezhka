package ru.kmept.kormezhka

import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Vi (itemView: View) : ViewHolder(itemView) {
    val dragImageView : ImageView
    val EditText : EditText
    init {
        dragImageView = itemView.findViewById(R.id.drag)
        EditText = itemView.findViewById(R.id.ROOT)
    }


}