package org.example.lesson_3

fun main() {
    var fromChar = "E"
    var fromNum = 2
    var toChar = "E"
    var toNum = 4
    var moveNumber = 1
    getString(fromChar, fromNum, toChar, toNum, moveNumber).also { println(it) }

    fromChar = "D"
    fromNum = 2
    toChar = "D"
    toNum = fromNum + 1
    moveNumber++
    getString(fromChar, fromNum, toChar, toNum, moveNumber).also { println(it) }
}

fun getString(fromChar: String, fromNum: Int, toChar: String, toNum: Int, moveNumber: Int): String =
    "$fromChar$fromNum-$toChar$toNum;$moveNumber"