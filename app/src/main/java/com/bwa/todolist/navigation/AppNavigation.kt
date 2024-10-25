package com.bwa.todolist.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bwa.todolist.ui.add.AddScreen
import com.bwa.todolist.ui.detail.DetailScreen
import com.bwa.todolist.ui.home.HomeScreen
import com.bwa.todolist.ui.home.HomeViewModel


@Composable
fun AppNavigation (
    viewModel: HomeViewModel
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController, viewModel = viewModel)
        }
        composable("add") {
            AddScreen(navController = navController, viewModel = viewModel)
        }
        composable("detail/{taskId}") {backStackEntry ->
            val taskId = backStackEntry.arguments?.getString("taskId")
            DetailScreen(
                navController = navController,
                viewModel = viewModel,
                taskId = taskId
            )
        }
    }
}