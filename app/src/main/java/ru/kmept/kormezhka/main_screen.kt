package ru.kmept.kormezhka

import android.content.res.ColorStateList
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class main_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen_activity)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)

        val adapter = ProductsAdapter()
        recyclerView.adapter = adapter

        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager

        val button_add = findViewById<Button>(R.id.button_add)
        val button_food = findViewById<Button>(R.id.button_food)
        val button_drink = findViewById<Button>(R.id.button_drink)

        setButtonColor(button_add, button_food, button_drink)

    }
    private fun setButtonColor(vararg buttons: Button) {
        for (button in buttons) {
            button.setOnClickListener {
                it.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.green))
                (it as Button).setTextColor(ContextCompat.getColor(this, R.color.text_color_light))
                changeOtherButtonsColor(it as Button, *buttons)
            }
        }
    }

    private fun changeOtherButtonsColor(selectedButton: Button, vararg buttons: Button) {
        for (button in buttons) {
            if (button != selectedButton) {
                button.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.gray))
                button.setTextColor(ContextCompat.getColor(this, R.color.text_color_dark))
            }
        }
    }
}