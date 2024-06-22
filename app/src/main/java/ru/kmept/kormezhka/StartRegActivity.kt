package ru.kmept.kormezhka

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class StartRegActivity() : AppCompatActivity(), TextWatcher, Callback<RegistrationResponse> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startreg)

        val passEditText: EditText = findViewById(R.id.passEditText)
        val checkPassLen: ImageView = findViewById(R.id.checkPassLen)
        val checkPassNum: ImageView = findViewById(R.id.checkPassNum)
        var hasDigit = false

        passEditText.addTextChangedListener(this)

        if (passEditText.length() >= 6) {
            checkPassLen.setBackgroundResource(R.drawable.check_circle)
        }
        else {
            checkPassLen.setBackgroundResource(R.drawable.group_28)
        }
        for (c in passEditText.text) {
            if (c.isDigit()) {
                hasDigit = true
            }
        }

        if (hasDigit == false) {
            checkPassNum.setBackgroundResource(R.drawable.group_28)
        }
        else if (hasDigit == true) {
            checkPassNum.setBackgroundResource(R.drawable.check_circle)
        }

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        var passEditText: EditText = findViewById(R.id.passEditText)
        val checkPassLen: ImageView = findViewById(R.id.checkPassLen)
        val checkPassNum: ImageView = findViewById(R.id.checkPassNum)
        var hasDigit = false

        if (passEditText.length() >= 6) {
            checkPassLen.setBackgroundResource(R.drawable.check_circle)
        }
        else {
            checkPassLen.setBackgroundResource(R.drawable.group_28)
        }
        for (c in passEditText.text) {
            if (c.isDigit()) {
                hasDigit = true
            }
        }

        if (hasDigit == false) {
            checkPassNum.setBackgroundResource(R.drawable.group_28)
        }
        else if (hasDigit == true) {
            checkPassNum.setBackgroundResource(R.drawable.check_circle)
        }

    }

    override fun afterTextChanged(s: Editable?) {

    }

    fun onClick(view: View) {

        var hasDigit = false
        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val passEditText: EditText = findViewById(R.id.passEditText)

        for (c in passEditText.text) {
            if (c.isDigit()) {
                hasDigit = true
            }
        }

        if (passEditText.text.toString().length >= 6 && hasDigit == true) {
            val user = User(emailEditText.text.toString(), passEditText.text.toString())
            RetrofitClient.apiService.createUser(user).enqueue(this)
        }
        else {
            Snackbar.make(findViewById(android.R.id.content), "Пароль не подходит", 6000).show()
        }



    }

    override fun onResponse(call: Call<RegistrationResponse>, response: Response<RegistrationResponse>) {
        val model = response.body()
        if (model?.regStatus == 1) {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
        else {
            Snackbar.make(findViewById(android.R.id.content), "Не успешно", 6000).show()
        }

    }



    override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
        Snackbar.make(findViewById(android.R.id.content), "Ошибка", 6000).show()
    }


}

