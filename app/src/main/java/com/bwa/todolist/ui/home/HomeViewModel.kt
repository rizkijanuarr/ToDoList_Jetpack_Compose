package com.bwa.todolist.ui.home

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.bwa.todolist.response.Task

class HomeViewModel: ViewModel() {

    private val _tasks = mutableStateListOf(
        Task("1", "Task 1", "Descrip 1"),
        Task("2", "Task 2", "Descrip 2"),
    )

    val tasks: List<Task> get() = _tasks

    fun addTask(task: Task) {
        _tasks.add(task)
    }

    fun deleteTask(taskId: String?) {
        _tasks.removeAll{ it.id == taskId}
    }

    fun getTaskById(taskId: String?): Task? {
        return _tasks.find { it.id == taskId }
    }
}