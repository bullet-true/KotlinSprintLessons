package org.example.lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = MainScreenState()
        println(mainScreenState)

        mainScreenState = mainScreenState.copy(isLoading = true)
        println(mainScreenState)

        mainScreenState = mainScreenState.copy(isLoading = false, data = "data")
        println(mainScreenState)
    }
}