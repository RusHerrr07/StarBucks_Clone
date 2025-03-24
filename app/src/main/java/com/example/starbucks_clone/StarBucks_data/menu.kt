package com.example.starbucks_clone.StarBucks_data

data class Menu(
    val id: Int,
    val title: String
)

val enumList = listOf(
    Menu(
        id = 1,
        title = "All"
    ),
    Menu(
        id = 2,
        title = "Coffee"
    ),
    Menu(
        id = 3,
        title = "Tea"
    ),
    Menu(
        id = 4,
        title = "Drinks"
    ),
    Menu(
        id = 5,
        title = "Bear"
    ),
    Menu(
        id = 6,
        title = "Wine"
    )
)
