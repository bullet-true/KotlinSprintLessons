package org.example.lesson_15

fun main() {
    val weatherServer = WeatherServer()
    val temperature = Temperature(25)
    val precipitation = PrecipitationAmount(5)

    weatherServer.sendData(temperature)
    weatherServer.sendData(precipitation)
}

abstract class WeatherStationStats {
    abstract val value: Int
}

class Temperature(override val value: Int) : WeatherStationStats()

class PrecipitationAmount(override val value: Int) : WeatherStationStats()

class WeatherServer() {
    fun sendData(stat: WeatherStationStats) {
        when (stat) {
            is Temperature -> println("Передача данных: температура - ${stat.value} °C")
            is PrecipitationAmount -> println("Передача данных: осадки - ${stat.value} мм")
        }
    }
}