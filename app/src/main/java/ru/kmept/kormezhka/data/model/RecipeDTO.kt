package ru.kmept.kormezhka.data.model

import java.util.Date
data class RecipeDTO (
    val id: Int,
    val name: String,
    val picture: String,
    val description: String,
    val ingredients: String,
    val stepJson: String,
    val duration: Int
)

