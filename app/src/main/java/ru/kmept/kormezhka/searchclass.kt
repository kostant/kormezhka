package ru.kmept.kormezhka

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class searchclass : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    var adapter = Adapter()
    lateinit var serch_line:EditText;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_layout)
        serch_line = findViewById(R.id.searchbandle)
        val firstfood =  findViewById<TextView>(R.id.sushi1)
        val secondfood =  findViewById<TextView>(R.id.sandwich2)
        val thirdfood =  findViewById<TextView>(R.id.seafood3)
        val fourfood =  findViewById<TextView>(R.id.sushi1)

        var nameTextView: TextView
        val itemSearchInTextbox: TextView

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
        val itemSearchInTextbox: TextView = findViewById(R.id.searchbandle)
        adapter.Add(itemSearchInTextbox.text.toString());
        adapter.notifyDataSetChanged()
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
