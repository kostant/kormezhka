package ru.kmept.kormezhka

object ProductListProvider {
    fun provideProducts(): Array<Product> {
        val product1 = Product()
        product1.userName = "Calum Levis"
        product1.productName = "Pancake"
        product1.userPhoto = R.drawable.calum_levis
        product1.productPhoto = R.drawable.pancake_calum

        val product2 = Product()
        product2.userName = "Eilif Sonas"
        product2.productName = "Salad"
        product2.userPhoto = R.drawable.eilif_photo
        product2.productPhoto = R.drawable.eilif_salad


        val product3 = Product()
        product3.userName = "Elena shelby"
        product3.productName = "Pancake"
        product3.userPhoto = R.drawable.elena_photo
        product3.productPhoto = R.drawable.elena_pancake

        val product4 = Product()
        product4.userName = "John Priyadi"
        product4.productName = "Salad"
        product4.userPhoto = R.drawable.john_photoo
        product4.productPhoto = R.drawable.john_salad

        // Return the array of products.
        return arrayOf(product1, product2, product3, product4)
    }
}