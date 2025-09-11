package org.example.lesson_14

fun main() {
    val phobos = Satellite(name = "Phobos", hasAtmosphere = false, isLandingPossible = true)
    val deimos = Satellite(name = "Deimos", hasAtmosphere = false, isLandingPossible = true)
    val mars = Planet(
        name = "Mars",
        hasAtmosphere = false,
        isLandingPossible = true,
        satellites = listOf(phobos, deimos)
    )
    mars.printInfo()
}

open class CelestialObject(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandingPossible: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandingPossible: Boolean,
    val satellites: List<Satellite>,
) : CelestialObject(name, hasAtmosphere, isLandingPossible) {

    fun printInfo() {
        println("Планета: $name")
        if (satellites.isNotEmpty()) {
            println("Спутники: ${satellites.joinToString(", ") { it.name }}")
        } else {
            println("У планеты нет спутников")
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandingPossible: Boolean,
) : CelestialObject(name, hasAtmosphere, isLandingPossible)