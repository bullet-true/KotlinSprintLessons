package org.example.lesson_3

fun main() {
    val number = 6
    var multiplicationTable = ""
    val range = 1..9

    for (i in range) {
        val calculating = "$number x $i = ${i * number}\n"
        multiplicationTable += calculating
    }

    print(multiplicationTable.trim())
}