package ru.kmept.kormezhka

import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.kmept.kormezhka.data.RecipesRepository
import ru.kmept.kormezhka.data.model.Recipe
import ru.kmept.kormezhka.data.model.RecipeDTO
import ru.kmept.kormezhka.recipe_detail.RecipeScreen

class main_screen : Fragment(), Callback<Array<RecipeDTO>> {

    val adapter = ProductsAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_screen_activity, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler)


        recyclerView.adapter = adapter
        adapter.onClickListener = {
            val intent = Intent(context, RecipeScreen::class.java)
            intent.putExtra("id", it.id)
            startActivity(intent)


        }

        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(context, 2)
        recyclerView.layoutManager = layoutManager

        val button_add = view.findViewById<Button>(R.id.button_add)
        val button_food = view.findViewById<Button>(R.id.button_food)
        val button_drink = view.findViewById<Button>(R.id.button_drink)

        setButtonColor(button_add, button_food, button_drink)

        RetrofitClient.apiService.getData().enqueue(this)

    }

    fun updateScreenWithRecipes(recipes: Array<RecipeDTO>) {
        // Обновить экран используя рецепты из массива recipes
        adapter.recipes = recipes
        adapter.notifyDataSetChanged()
    }

    private fun setButtonColor(vararg buttons: Button) {
        for (button in buttons) {
            button.setOnClickListener {
                it.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.green))
                (it as Button).setTextColor(ContextCompat.getColor(requireContext(), R.color.text_color_light))
                changeOtherButtonsColor(it as Button, *buttons)
            }
        }
    }

    private fun changeOtherButtonsColor(selectedButton: Button, vararg buttons: Button) {
        for (button in buttons) {
            if (button != selectedButton) {
                button.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.gray))
                button.setTextColor(ContextCompat.getColor(requireContext(), R.color.text_color_dark))
            }
        }
    }

    override fun onResponse(p0: Call<Array<RecipeDTO>>, p1: Response<Array<RecipeDTO>>) {
        updateScreenWithRecipes(p1.body()!!)
    }

    override fun onFailure(p0: Call<Array<RecipeDTO>>, p1: Throwable) {
        TODO("Not yet implemented")
    }
}