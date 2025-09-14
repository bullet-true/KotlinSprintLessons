package org.example.lesson_15

fun main() {
    val ladaVesta = PassengerCar("Lada Vesta")
    val ladaGranta = PassengerCar("Lada Granta")
    val kamaz = Truck("Kamaz")

    ladaVesta.loadPassengers(2)
    ladaVesta.move()
    ladaGranta.loadPassengers(3)
    ladaGranta.move()
    kamaz.loadPassengers(1)
    kamaz.loadCargo(2)
    kamaz.move()
}

interface Vehicle {
    fun move()
    fun stop()
}

interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    private val freeSeats get() = maxPassengers - currentPassengers

    fun loadPassengers(personCount: Int) {

        if (freeSeats == 0) {
            println("В транспорте нет мест для посадки!")
            return
        }

        val passengerLoaded = personCount.coerceAtMost(freeSeats)
        currentPassengers += passengerLoaded
        println("$passengerLoaded пассажир(а) сел(и) в транспорт. Осталось свободных мест: $freeSeats")
    }

    fun unloadPassengers(personCount: Int) {
        if (currentPassengers == 0) {
            println("В транспорте нет пассажиров!")
            return
        }

        val passengerUnloaded = personCount.coerceAtMost(currentPassengers)
        currentPassengers -= passengerUnloaded
        println("$passengerUnloaded пассажир(а) вышел(ли) из транспорта. Осталось пассажиров: ${currentPassengers}. Осталось свободных мест: $freeSeats")
    }
}

interface CargoTransport {
    val maxCargo: Int
    var currentCargo: Int

    private val freeSpace get() = maxCargo - currentCargo

    fun loadCargo(weight: Int) {
        if (freeSpace == 0) {
            println("Грузовик полностью загружен, загрузить груз невозможно!")
            return
        }

        val cargoLoaded = weight.coerceAtMost(freeSpace)
        currentCargo += cargoLoaded
        println("Загружено $cargoLoaded тонна(ы) в грузовик. Можно еще загрузить: $freeSpace тонн(ы)")
    }

    fun unloadCargo(weight: Int) {
        if (currentCargo == 0) {
            println("Грузовик пустой, разгрузка невозможна!")
            return
        }

        val cargoUploaded = weight.coerceAtMost(currentCargo)
        currentCargo -= cargoUploaded
        println("Выгружено $cargoUploaded тонн(ы). Осталось в грузовике: $currentCargo тонн(ы)")
    }
}

abstract class Car(val model: String) : Vehicle {
    override fun move() {
        println("\"$model\" начал движение")
    }

    override fun stop() {
        println("\"$model\" остановился")
    }
}

class PassengerCar(
    model: String,
    override val maxPassengers: Int = 3,
    override var currentPassengers: Int = 0
) : Car(model), PassengerTransport {

    override fun loadPassengers(personCount: Int) {
        print("Загрузка пассажиров в $model: ")
        super.loadPassengers(personCount)
    }

    override fun unloadPassengers(personCount: Int) {
        print("Выгрузка пассажиров из $model: ")
        super.unloadPassengers(personCount)
    }
}

class Truck(
    model: String,
    override val maxCargo: Int = 2,
    override var currentCargo: Int = 0,
    override val maxPassengers: Int = 1,
    override var currentPassengers: Int = 0
) : Car(model), PassengerTransport, CargoTransport {

    override fun loadPassengers(personCount: Int) {
        print("Загрузка пассажиров в $model: ")
        super.loadPassengers(personCount)
    }

    override fun unloadPassengers(personCount: Int) {
        print("Выгрузка пассажиров из $model: ")
        super.unloadPassengers(personCount)
    }

    override fun loadCargo(weight: Int) {
        print("Загрузка груза в $model: ")
        super.loadCargo(weight)
    }

    override fun unloadCargo(weight: Int) {
        print("Разгрузка груза из $model: ")
        super.unloadCargo(weight)
    }
}