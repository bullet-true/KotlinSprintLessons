package org.example.lesson_16

class Order(private val orderNumber: Int) {
    private var isOrderReady: Boolean = false

    fun updateOrderStatus(newStatus: Boolean) {
        isOrderReady = newStatus
    }
}