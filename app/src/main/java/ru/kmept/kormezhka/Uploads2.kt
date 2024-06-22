package ru.kmept.kormezhka

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Uploads2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.uploads2)
    }
    fun onClicBack(view: View) {
        val intent = Intent(this, createrecip::class.java)
        startActivity(intent)
    }
}