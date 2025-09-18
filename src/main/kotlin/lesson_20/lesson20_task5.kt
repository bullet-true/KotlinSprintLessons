package org.example.lesson_20

fun main() {
    val bender = Robot()
    bender.say()
    bender.setModifier { phrase -> phrase.reversed() }
    bender.say()

    val binaryMod: ((String) -> String) = { text ->
        text.toCharArray()
            .joinToString(" ") { it.code.toString(2).padStart(8, '0') }
    }
    bender.setModifier(binaryMod)
    bender.say()
}

class Robot {
    private val phrases = listOf(
        "Bite my shiny metal ass!",
        "Kill all humans!",
        "Game's over, losers! I have all the money.",
        "I'm Bender, baby! Please insert liquor!",
        "This is the worst kind of discrimination: the kind against me!"
    )

    private var modifier: ((String) -> String) = { it }

    fun say() {
        val randomPhrase = phrases.random()
        println(modifier(randomPhrase))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}