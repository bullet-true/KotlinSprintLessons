package org.example.lesson_14

fun main() {
    val passengerLiner = PassengerLiner(name = "Titanic", passengerCapacity = 2453)
    val cargoShip = CargoShip(name = "CMA CGM Christophe Colomb", cargoCapacity = 100_000)
    val icebreaker = Icebreaker(name = "Якутия", iceThickness = 3, passengerCapacity = 53)

    passengerLiner.apply {
        sail()
        getInfo()
        getLuxuryClass()
    }

    cargoShip.apply {
        sail()
        getInfo()
        loadCargo()
    }

    icebreaker.apply {
        sail()
        getInfo()
        breakIce()
    }
}

open class Liner(
    val name: String = "Liner",
    open val speed: Int = 25,
    open val passengerCapacity: Int = 2000,
    open val cargoCapacity: Int = 2000,
) {
    fun sail() {
        println("$name плывет со скоростью $speed узлов")
    }

    fun getInfo() {
        println("Характеристики: \n$name: скорость = $speed узлов, вместимость пассажиров = $passengerCapacity, грузоподъемность: $cargoCapacity")
    }
}

class CargoShip(
    name: String,
    override val speed: Int = 10,
    override val passengerCapacity: Int = 50,
    override val cargoCapacity: Int = 50_000,
    val cargoType: String = "контейнеры"
) : Liner(name, speed, passengerCapacity, cargoCapacity) {

    fun loadCargo() {
        println("Загружаем $name типом груза : $cargoType")
    }
}

class Icebreaker(
    name: String,
    override val speed: Int = 5,
    override val passengerCapacity: Int = 20,
    override val cargoCapacity: Int = 5000,
    val iceThickness: Int = 1
) : Liner(name, speed, passengerCapacity, cargoCapacity) {

    fun breakIce() {
        println("$name колет лед толщиной $iceThickness метра")
    }
}

class PassengerLiner(
    name: String,
    override val speed: Int = 25,
    override val passengerCapacity: Int = 5000,
    override val cargoCapacity: Int = 1000,
    val luxuryClass: String = "Premium"
) : Liner(name, speed, passengerCapacity, cargoCapacity) {

    fun getLuxuryClass() {
        println("Уровень роскошности $name: $luxuryClass")
    }
}