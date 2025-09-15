package org.example.lesson_17

fun main() {
    val folder = Folder("Documents", 50, true)
    println(folder.name)
    println(folder.fileCount)
}

class Folder(
    _name: String,
    _fileCount: Int,
    private var isSecret: Boolean,
) {
    val name: String = _name
        get() = if (isSecret) "скрытая папка" else field

    val fileCount: Int = _fileCount
        get() = if (isSecret) 0 else field
}