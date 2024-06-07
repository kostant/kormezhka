package ru.kmept.kormezhka

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class searchclass : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    var adapter = UsersAdapter()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_layout)
        val nameTextView: TextView
        val itemSearchInTextbox: TextView

        // получаем ссылку на RecyclerView
         recyclerView = findViewById(R.id.recyclerView)

        // Создаем Adapter и привязываем его к RecyclerView
        recyclerView.adapter = adapter

        // Создаем LayoutManager и привязываем его к RecyclerView
        // LinearLayoutManager значит что ячейки будут располагаться вертикально последовательно
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun search(view: View)
    {
        val itemSearchInTextbox: TextView = findViewById(R.id.searchbandle)
        adapter.Add(itemSearchInTextbox.text.toString());
        adapter.notifyDataSetChanged()
    }
}
