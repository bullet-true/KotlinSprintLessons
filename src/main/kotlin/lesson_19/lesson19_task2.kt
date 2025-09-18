package org.example.lesson_19

fun main() {
    val phone = Product("Pixel 7", 777, Category.OTHER)
    val jacket = Product("Windbreaker", 21, Category.CLOTHES)
    val stapler = Product("Stapler", 11, Category.STATIONERY)

    listOf(phone, jacket, stapler).forEach {
        it.getProductInfo()
    }
}

enum class Category(private val displayName: String) {
    CLOTHES("Clothes"),
    STATIONERY("Stationery"),
    OTHER("Other");

    fun getCategoryName(): String = displayName
}

class Product(val name: String, val id: Int, val category: Category) {

    fun getProductInfo() {
        println("Название товара: $name, ID товара: $id, Категория товара: ${category.getCategoryName()}")
    }
}