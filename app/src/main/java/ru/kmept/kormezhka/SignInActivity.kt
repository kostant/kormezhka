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
import com.google.android.material.snackbar.Snackbar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SignInActivity : AppCompatActivity(), Callback<LogInResponse> {
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
        val Log = findViewById<EditText>(R.id.SignInLogin)
        val Pass = findViewById<EditText>(R.id.SignInPasswd)
        val userLog = UserLog(Log.text.toString(), Pass.text.toString())
        RetrofitClientLog.apiServiceLog.logUser(userLog).enqueue(this)
    }

    override fun onResponse(p0: Call<LogInResponse>, p1: Response<LogInResponse>) {
        val model = p1.body()
        if (model?.logStatus == 1) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onFailure(p0: Call<LogInResponse>, p1: Throwable) {
        //Log.d("KMEPT", p1.localizedMessage)
        Snackbar.make(findViewById(android.R.id.content),"Неверный Логин или пароль", Snackbar.LENGTH_LONG).show()
    }
}