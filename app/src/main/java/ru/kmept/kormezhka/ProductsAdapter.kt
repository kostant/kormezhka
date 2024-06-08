package ru.kmept.kormezhka

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter : RecyclerView.Adapter<ProductViewHolder>() {

    lateinit var onClickListener:((Product) -> Unit)

    var products: Array<Product> = ProductListProvider.provideProducts()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product: Product = products[position]
        val userNameTextView: TextView = holder.itemView.findViewById(R.id.user_name)
        userNameTextView.setText(product.userName)

        val productNameTextView: TextView = holder.itemView.findViewById(R.id.product_name)
        productNameTextView.setText(product.productName)

        val userImageView: ImageView = holder.itemView.findViewById(R.id.user_photo)
        userImageView.setImageResource(product.userPhoto)

        val productImageView: ImageView = holder.itemView.findViewById(R.id.product_photo)
        productImageView.setImageResource(product.productPhoto)

        holder.itemView.setOnClickListener{
            onClickListener(product)
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}