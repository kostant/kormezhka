package ru.kmept.kormezhka

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class searchclass : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    var adapter = Adapter()
    lateinit var serch_line:EditText;
     lateinit var searchhelper:LinearLayout;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_layout)
        serch_line = findViewById(R.id.searchbandle)
        adapter.searchLine = serch_line

        // получаем ссылку на RecyclerView
         recyclerView = findViewById(R.id.recyclerView)

        // Создаем Adapter и привязываем его к RecyclerView
        recyclerView.adapter = adapter

        // Создаем LayoutManager и привязываем его к RecyclerView
        // LinearLayoutManager значит что ячейки будут располагаться вертикально последовательно
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun goback(view: View)
    {
        val intent = Intent(this@searchclass, MainActivity::class.java)
        startActivity(intent)
    }

    fun search(view: View)
    {
        if (serch_line.getText().toString().trim().length == 0)
        {
            serch_line.setHint("Пустое поле");
        }
        else
        {
            val itemSearchInTextbox: TextView = findViewById(R.id.searchbandle)
            adapter.Add(itemSearchInTextbox.text.toString());
            adapter.notifyDataSetChanged()
            serch_line.setHint("Введите запрос");

            searchhelper = findViewById(R.id.searchhelper)
            searchhelper.isVisible = false
        }

    }

    fun clearthesearch(view: View)
    {   serch_line.setText("");
        serch_line.setHint("Введите запрос");
    }
    fun first_offer(view: View)
    {
        val searchbandle = findViewById<TextView>(R.id.sushi1)
        serch_line.setText(searchbandle.text);
    }
    fun second_offer(view: View)
    {
        val searchbandle = findViewById<TextView>(R.id.sandwich2)
        serch_line.setText(searchbandle.text);
    }
    fun third_offer(view: View)
    {
        val searchbandle = findViewById<TextView>(R.id.seafood3)
        serch_line.setText(searchbandle.text);
    }
    fun four_offer(view: View)
    {
        val searchbandle = findViewById<TextView>(R.id.friedrice4)
        serch_line.setText(searchbandle.text);
    }

}
