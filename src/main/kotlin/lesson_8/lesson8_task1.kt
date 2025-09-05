package org.example.lesson_8

import kotlin.random.Random

fun main() {
    val views = intArrayOf(0, 0, 0, 0, 0, 0, 0)

    for (i in 0 until views.size) {
        views[i] = Random.nextInt(0, 100)
    }
    println(views.joinToString(","))
    println(views.sum())
}