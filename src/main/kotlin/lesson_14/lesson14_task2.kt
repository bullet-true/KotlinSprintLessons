package org.example.lesson_14

fun main() {
    val passengerLiner = PassengerBaseLiner(name = "Titanic", passengerCapacity = 2453)
    val cargoShip = CargoShipBase(name = "CMA CGM Christophe Colomb", cargoCapacity = 100_000)
    val icebreaker = IcebreakerBase(name = "Якутия", iceThickness = 3, passengerCapacity = 53)

    passengerLiner.apply {
        load()
        getInfo()
    }

    cargoShip.apply {
        load()
        getInfo()
    }

    icebreaker.apply {
        load()
        getInfo()
    }
}

open class BaseLiner(
    val name: String = "Liner",
    open val speed: Int = 25,
    open val passengerCapacity: Int = 2000,
    open val cargoCapacity: Int = 2000,
) {
    fun sail() {
        println("$name плывет со скоростью $speed узлов")
    }

    open fun getInfo() {
        println("Характеристики: \n$name: скорость = $speed узлов, вместимость пассажиров = $passengerCapacity, грузоподъемность: $cargoCapacity")
    }

    open fun load() {
        println("Базовая погрузка для $name")
    }
}

class CargoShipBase(
    name: String,
    override val speed: Int = 10,
    override val passengerCapacity: Int = 50,
    override val cargoCapacity: Int = 50_000,
    val cargoType: String = "контейнеры"
) : BaseLiner(name, speed, passengerCapacity, cargoCapacity) {

    fun loadCargo() {
        println("Загружаем $name типом груза : $cargoType")
    }

    override fun load() {
        println("$name активирует погрузочный кран для загрузки: $cargoType")
    }

    override fun getInfo() {
        super.getInfo()
        println("$name может перевозить тип груза: $cargoType")
    }

}

class IcebreakerBase(
    name: String,
    override val speed: Int = 5,
    override val passengerCapacity: Int = 20,
    override val cargoCapacity: Int = 5000,
    val iceThickness: Int = 1
) : BaseLiner(name, speed, passengerCapacity, cargoCapacity) {

    fun breakIce() {
        println("$name колет лед толщиной $iceThickness метра")
    }

    override fun load() {
        println("$name открывает ворота со стороны кормы")
    }

    override fun getInfo() {
        super.getInfo()
        println("Ледокол $name может колоть лед толщиной $iceThickness метра")
    }
}

class PassengerBaseLiner(
    name: String,
    override val speed: Int = 25,
    override val passengerCapacity: Int = 5000,
    override val cargoCapacity: Int = 1000,
    val luxuryClass: String = "Premium"
) : BaseLiner(name, speed, passengerCapacity, cargoCapacity) {

    fun getLuxuryClass() {
        println("Уровень роскошности $name: $luxuryClass")
    }

    override fun load() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

    override fun getInfo() {
        super.getInfo()
        println("Класс роскошности у $name: $luxuryClass")
    }
}