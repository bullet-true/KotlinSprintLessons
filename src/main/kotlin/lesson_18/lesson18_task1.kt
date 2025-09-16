package org.example.lesson_18

fun main() {
    val firstOrder = Order(1)
    val secondOrder = Order(2)

    firstOrder.printInfo("телефон")
    secondOrder.printInfo(listOf("клавиатура", "мышь", "монитор"))
}

class Order(val orderNumber: Int) {

    fun printInfo(product: String) {
        println("Заказан товар: $product. Номер заказа: $orderNumber")
    }

    fun printInfo(product: List<String>) {
        println("Заказаны следующие товары: ${product.joinToString(", ")}. Номер заказа: $orderNumber")
    }
}