package ru.kmept.kormezhka





import android.view.LayoutInflater


import android.view.ViewGroup


import androidx.recyclerview.widget.RecyclerView

class CreateResaitAdapter: RecyclerView.Adapter<Vi>() {
    override fun onCreateViewHolder(parnet: ViewGroup, viewType: Int): Vi {
        val itemView = LayoutInflater.from(parnet.context).inflate(R.layout.spisok, parnet, false)
        return Vi(itemView)
    }


    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: Vi, position: Int) {
    }
}