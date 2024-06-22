package ru.kmept.kormezhka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Timer
import java.util.TimerTask

class MailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.email_main)
        runTimer()
    }
    // Запускает таймер
    fun runTimer() {
        val timer = Timer()
        // указываем сколько секунд должно протикать
        var seconds = 180
        val task: TimerTask = object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    updateUiWithSeconds(seconds)
                    seconds--
                }
            }
        }

        // Запускаем таймер(1000 это в миллисекундах период тика, то есть 1 секунда)
        timer.schedule(task, 0, 1000)
    }

    fun updateUiWithSeconds(seconds: Int) {
        val textView: TextView = findViewById(R.id.timer)
        textView.text = "$seconds"

        val minutes = seconds / 60
        val remainSeconds = seconds % 60

        val string = minutes.toString() + ":" + remainSeconds.toString()
        textView.text = string

    }

}