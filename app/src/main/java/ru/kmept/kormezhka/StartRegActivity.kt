package ru.kmept.kormezhka

import android.content.Intent.getIntent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class StartRegActivity : AppCompatActivity(), TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startreg)

        var passEditText: EditText = findViewById(R.id.passEditText)
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


}

