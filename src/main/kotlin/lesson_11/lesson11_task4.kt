package org.example.lesson_11

data class RecipeCategory(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val listOfRecipes: List<Recipe>,
)

data class Recipe(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val ingredients: List<Ingredient>,
    val cookingMethod: List<String>,
    val isFavorite: Boolean = false,
)

data class Ingredient(
    val id: Int,
    val name: String,
    val amount: String,
    val unit: String,
)