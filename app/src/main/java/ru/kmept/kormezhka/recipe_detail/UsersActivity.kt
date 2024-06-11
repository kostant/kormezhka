package ru.kmept.kormezhka.recipe_detail
import ru.kmept.kormezhka.R

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class UsersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akaunt)

        // получаем ссылку на RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Создаем Adapter и привязываем его к RecyclerView
        val adapter = UsersAdapter()
        recyclerView.adapter = adapter

        // Создаем LayoutManager и привязываем его к RecyclerView
        // LinearLayoutManager значит что ячейки будут располагаться вертикально последовательно
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
