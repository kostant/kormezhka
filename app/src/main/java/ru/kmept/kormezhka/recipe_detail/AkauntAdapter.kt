package ru.kmept.kormezhka.recipe_detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.kmept.kormezhka.R

class AkauntAdapter: RecyclerView.Adapter<ViewHolder2>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder2 {
            // Здесь необходимо создать ViewHolder используя файл верстки
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.werstkaakfunt, parent, false)
            return ViewHolder2(itemView)
        }

        override fun getItemCount(): Int {
            // Тут необходимо вернуть число - количество ячеек в таблице,
            // пока возвращаем заглушку - 10
            return 10
        }

        override fun onBindViewHolder(holder: ViewHolder2, position: Int) {
            // Здесь будет логика, которая будет конфигурировать конкретную ячейку и выставлять
            // нужную аватарку имя и тд
            // Пока оставляем пустым
        }
    }
