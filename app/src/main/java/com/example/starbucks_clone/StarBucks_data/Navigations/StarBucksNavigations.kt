package com.example.starbucks_clone.StarBucks_data.Navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.starbucks_clone.StarBucks_data.Screens.HomeScreen
import com.example.starbucks_clone.StarBucks_data.Screens.StartScreen

@Composable
fun StarBucksNavigations() {
    val navHostController: NavHostController = rememberNavController()

    NavHost(
        navController = navHostController,
        startDestination = START_SCREEN // Corrected reference
    ) {
        composable(START_SCREEN) {
            StartScreen(navHostController = navHostController)
        }
        composable(HOME_SCREEN) {
            HomeScreen(navHostController = navHostController)
        }
        composable(PRODUCT_DETAILS_SCREEN) {
            ProductDetailsScreen(navHostController = navHostController)
        }
    }
}

@Composable
fun ProductDetailsScreen(navHostController: NavHostController) {
//    TODO("Not yet implemented")
}

// Constants for routes (Now properly named)
const val START_SCREEN = "start_screen"
const val HOME_SCREEN = "home_screen"
const val PRODUCT_DETAILS_SCREEN = "product_details_screen"
