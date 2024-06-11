package ru.kmept.kormezhka

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import org.jetbrains.annotations.NotNull
import kotlin.math.sign


class Adapter: RecyclerView.Adapter<SearchHistoryItemViewHolder>() {
    var list:ArrayList<String> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHistoryItemViewHolder {

        // Здесь необходимо создать ViewHolder используя файл верстки
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return SearchHistoryItemViewHolder (itemView)
    }

    override fun getItemCount(): Int {

        // Тут необходимо вернуть число - количество ячеек в таблице,
        // пока возвращаем заглушку - 10
        return list.size
    }
    public fun Add(text:String)
    {
        list.add(text)
    }
    override fun onBindViewHolder(holder: SearchHistoryItemViewHolder, position: Int) {
        // Здесь будет логика, которая будет конфигурировать конкретную ячейку и выставлять
        // нужную аватарку имя и тд
        // Пока оставляем пустым

            holder.SetText(list[position])
    }
}