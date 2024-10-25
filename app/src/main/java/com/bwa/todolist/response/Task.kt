package com.bwa.todolist.response

data class Task (
    val id: String,
    val title: String,
    val description: String ?= null,
)