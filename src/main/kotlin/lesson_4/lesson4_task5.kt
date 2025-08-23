package org.example.lesson_4

fun main() {
    var isShipDamaged: Boolean? = null
    var crewCount: Int
    var provisions: Int
    var isWeatherFavorable: Boolean? = null

    while (isShipDamaged == null) {
        println("Корабль имеет повреждения? (введите 'да' или 'нет'):")
        val input = readln().lowercase()
        isShipDamaged = when (input) {
            "да" -> true
            "нет" -> false
            else -> {
                println("Ошибка: введите только 'да' или 'нет'")
                null
            }
        }
    }

    do {
        println("Введите число членов экипажа (целое число):")
        crewCount = readln().toIntOrNull() ?: -1
        if (crewCount < 0) {
            println("Ошибка: введите только целое число больше 0")
        }
    } while (crewCount < 0)

    do {
        println("Введите количество ящиков провизии (целое число):")
        provisions = readln().toIntOrNull() ?: -1
        if (provisions < 0) {
            println("Ошибка: введите только целое число больше 0")
        }
    } while (provisions < 0)

    while (isWeatherFavorable == null) {
        println("Погода благоприятна? (введите 'да' или 'нет'):")
        val input = readln().lowercase()
        isWeatherFavorable = when (input) {
            "да" -> true
            "нет" -> false
            else -> {
                println("Ошибка: введите только 'да' или 'нет'")
                null
            }
        }
    }

    val canSail = (!isShipDamaged && crewCount in 55..70 && provisions > 50) ||
            (isShipDamaged && crewCount == 70 && provisions >= 50 && isWeatherFavorable)
    println("Корабль ${if (canSail) "может" else "не может"} отправиться в плавание")
}