package ru.kmept.kormezhka

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation
import retrofit2.Call
import ru.kmept.kormezhka.data.model.Recipe
import retrofit2.Callback
import retrofit2.Response
import ru.kmept.kormezhka.data.model.RecipeDTO


class ProductsAdapter : RecyclerView.Adapter<ProductViewHolder>(),Callback<RecipeDTO>{

    lateinit var onClickListener:((RecipeDTO) -> Unit)
    var recipes: Array<RecipeDTO> = emptyArray()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val recipe: RecipeDTO = recipes[position]
        val radius = 90
        val radius2 = 160
        val transformation = RoundedCornersTransformation(radius, 0, RoundedCornersTransformation.CornerType.ALL)
        val transformation2 = RoundedCornersTransformation(radius2, 0, RoundedCornersTransformation.CornerType.ALL)


       // val userNameTextView: TextView = holder.itemView.findViewById(R.id.user_name)
      //  userNameTextView.setText(recipe.author.name)

        val productNameTextView: TextView = holder.itemView.findViewById(R.id.product_name)
        productNameTextView.setText(recipe.name)

       // val userImageView: ImageView = holder.itemView.findViewById(R.id.user_photo)
       // Picasso.get().load(recipe.author.avatarUrl).transform(transformation).into(userImageView)

        val productImageView: ImageView = holder.itemView.findViewById(R.id.product_photo)
        Picasso.get().load(recipe.picture).transform(transformation).into(productImageView)

        val productDuration: TextView = holder.itemView.findViewById(R.id.duration)
        productDuration.setText( ">" + recipe.duration.toString() + " mins")
        
        holder.itemView.setOnClickListener{
            onClickListener(recipe)
        }
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    override fun onResponse(call: Call<RecipeDTO>, response: Response<RecipeDTO>) {
        val model = response.body()
        if(model != null) {
            // Обработать результат запроса
            // В model будет лежать результат запроса
        }
    }

    override fun onFailure(call: Call<RecipeDTO>, t: Throwable) {
        // Здесь обработать ошибку, например показать Snackbar
    }
}