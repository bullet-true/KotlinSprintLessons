package org.example.lesson_11

data class RecipeCategory(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
)

data class Recipe(
    val id: Int,
    val name: String,
    val image: String,
    val servings: Int,
    val ingredients: MutableList<Ingredient>,
    val cookingMethod: String,
    val isFavorite: Boolean = false,
)

data class Ingredient(
    val id: Int,
    val name: String,
    val amount: Int,
    val unit: UnitType,
)

enum class UnitType {
    GRAM,
    PIECE,
    TABLESPOON,
}