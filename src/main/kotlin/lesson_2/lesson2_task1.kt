package org.example.lesson_2

fun main() {
    val numberOfStudents = 4
    val gradeOfFirstStudent = 3
    val gradeOfSecondStudent = 4
    val gradeOfThirdStudent = 3
    val gradeOfFourthStudent = 5

    val average =
        (gradeOfFirstStudent + gradeOfSecondStudent + gradeOfThirdStudent + gradeOfFourthStudent).toDouble() / numberOfStudents
    println(average)
}