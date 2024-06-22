package ru.kmept.kormezhka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.kmept.kormezhka.recipe_detail.AkauntAdapter

class Akaunt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akaunt)

        // получаем ссылку на RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Создаем Adapter и привязываем его к RecyclerView
        val adapter = AkauntAdapter()
        recyclerView.adapter = adapter

        // Создаем LayoutManager и привязываем его к RecyclerView
        // LinearLayoutManager значит что ячейки будут располагаться вертикально последовательно
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}