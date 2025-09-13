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

    fun loadPassengers(personCount: Int)
    fun unloadPassengers(personCount: Int)
}

interface CargoTransport {
    val maxCargo: Int
    var currentCargo: Int

    fun loadCargo(weight: Int)
    fun unloadCargo(weight: Int)
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

    private val freeSeats get() = maxPassengers - currentPassengers

    override fun loadPassengers(personCount: Int) {
        if (freeSeats == 0) {
            println("В транспорте \"$model\" нет мест для посадки!")
            return
        }

        val passengerLoaded = personCount.coerceAtMost(freeSeats)
        currentPassengers += passengerLoaded
        println("$passengerLoaded пассажир(а) сел(и) в транспорт \"$model\". Осталось свободных мест: $freeSeats")
    }

    override fun unloadPassengers(personCount: Int) {
        if (currentPassengers == 0) {
            println("В транспорте \"$model\" нет пассажиров!")
            return
        }

        val passengerUnloaded = personCount.coerceAtMost(currentPassengers)
        currentPassengers -= passengerUnloaded
        println("$passengerUnloaded пассажир(а) вышел(ли) из транспорта \"$model\". Осталось пассажиров: ${currentPassengers}. Осталось свободных мест: $freeSeats")
    }
}

class Truck(
    model: String,
    override val maxCargo: Int = 2,
    override var currentCargo: Int = 0,
    override val maxPassengers: Int = 1,
    override var currentPassengers: Int = 0
) : Car(model), PassengerTransport, CargoTransport {

    private val freeSeats get() = maxPassengers - currentPassengers
    private val freeSpace get() = maxCargo - currentCargo

    override fun loadCargo(weight: Int) {
        if (freeSpace == 0) {
            println("Грузовик \"$model\" полностью загружен, загрузить груз невозможно!")
            return
        }

        val cargoLoaded = weight.coerceAtMost(freeSpace)
        currentCargo += cargoLoaded
        println("Загружено $cargoLoaded тонна(ы) в грузовик \"$model\". Можно еще загрузить: $freeSpace тонн(ы)")
    }

    override fun unloadCargo(weight: Int) {
        if (currentCargo == 0) {
            println("Грузовик \"$model\" пустой, разгрузка невозможна!")
            return
        }

        val cargoUploaded = weight.coerceAtMost(currentCargo)
        currentCargo -= cargoUploaded
        println("Из \"$model\" выгружено $cargoUploaded тонн(ы). Осталось в грузовике: $currentCargo тонн(ы)")
    }

    override fun loadPassengers(personCount: Int) {
        if (freeSeats == 0) {
            println("В транспорте \"$model\" нет мест для посадки!")
            return
        }

        val passengerLoaded = personCount.coerceAtMost(freeSeats)
        currentPassengers += passengerLoaded
        println("$passengerLoaded пассажир(а) сел(и) в транспорт \"$model\". Осталось свободных мест: $freeSeats")
    }

    override fun unloadPassengers(personCount: Int) {
        if (currentPassengers == 0) {
            println("В транспорте \"$model\" нет пассажиров!")
            return
        }

        val passengerUnloaded = personCount.coerceAtMost(currentPassengers)
        currentPassengers -= passengerUnloaded
        println("$passengerUnloaded пассажир(а) вышел(ли) из транспорта \"$model\". Осталось пассажиров: ${currentPassengers}. Осталось свободных мест: $freeSeats")
    }
}