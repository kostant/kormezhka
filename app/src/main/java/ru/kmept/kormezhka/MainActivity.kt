package ru.kmept.kormezhka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun gotonextpage(view: View)
    {
        val intent = Intent(this@MainActivity, searchclass::class.java)
        startActivity(intent)
    }
}