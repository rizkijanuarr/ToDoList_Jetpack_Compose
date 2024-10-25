package com.bwa.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.bwa.todolist.navigation.AppNavigation
import com.bwa.todolist.ui.home.HomeViewModel
import com.bwa.todolist.ui.theme.TodoListTheme

class MainActivity : ComponentActivity() {

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoListTheme {
                AppNavigation(viewModel)
            }
        }
    }
}