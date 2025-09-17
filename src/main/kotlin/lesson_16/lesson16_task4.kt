package org.example.lesson_16

class Order(private val orderNumber: Int) {
    private var isOrderReady: Boolean = false

    private fun updateOrderStatus(newStatus: Boolean) {
        isOrderReady = newStatus
        println("Статус заказа №$orderNumber изменена на: ${if (isOrderReady) "готов" else "не готов"}")
    }

    fun requestStatusChange(newStatus: Boolean) {
        println("Заявка менеджеру на изменение статуса заказа №$orderNumber")
        updateOrderStatus(newStatus)
    }
}