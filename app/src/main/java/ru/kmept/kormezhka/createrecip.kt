package ru.kmept.kormezhka

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class createrecip : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.createrecipecnivity)
        val cancel2: TextView = findViewById(R.id.exitee)
        cancel2.setOnClickListener {
            finish()
        }

    }
}