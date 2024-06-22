package ru.kmept.kormezhka.recipe_detail

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.kmept.kormezhka.R
import ru.kmept.kormezhka.SignInActivity

class firstactClass: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun HelloButton(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}