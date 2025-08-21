package org.example.lesson_1

fun main() {
    var ordersCount: Int = 75
    val thanksMessageForOrder: String = "Thanks for the order!"
    println("Number of orders: $ordersCount")
    println(thanksMessageForOrder)

    var numberOfEmployees = 2000
//    println("Number of employees: $numberOfEmployees")
    numberOfEmployees -= 1
    println("Number of employees: $numberOfEmployees")
}