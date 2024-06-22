package ru.kmept.kormezhka

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class upload2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.upload_step2)
        val cancel2: TextView = findViewById(R.id.exitee)
        cancel2.setOnClickListener {
            finish()
        }
        val cancel3: Button = findViewById(R.id.backBTN)
        cancel3.setOnClickListener {
            finish()
        }

    }
}
