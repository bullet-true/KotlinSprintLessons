package org.example.lesson_19

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.load(Ammo.RED)
    tank.shoot()
}

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank() {
    private var currentAmmo: Ammo? = null

    fun load(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк заряжен боеприпасом: ${currentAmmo?.name}")
    }

    fun shoot() {
        if (currentAmmo == null) {
            println("Танк не заряжен")
        } else {
            println("Танк выстрелил. Нанесено ${currentAmmo?.damage} урона")
            currentAmmo = null
        }
    }
}