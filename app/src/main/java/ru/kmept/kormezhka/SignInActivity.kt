package ru.kmept.kormezhka

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_activity)
    }

    fun onClickEye(view: View) {
        val Pass = findViewById<EditText>(R.id.SignInPasswd)
        val Eye = findViewById<ImageView>(R.id.EyePasswd)

        if (Pass.inputType == TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD) {
            Pass.setInputType(TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
            Eye.setImageResource(R.drawable.hide)
        } else {
            Pass.setInputType(TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD)
            Eye.setImageResource(R.drawable.show1)
        }
    }

    fun onClickLogIn(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}