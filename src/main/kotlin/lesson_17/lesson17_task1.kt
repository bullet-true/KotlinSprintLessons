package org.example.lesson_17

class Quiz(
    private val _question: String,
    private var _answer: String
) {
    val question: String
        get() = _question

    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}