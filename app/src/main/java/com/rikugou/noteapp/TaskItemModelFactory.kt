package com.rikugou.noteapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TaskItemModelFactory(private val repository: TaskItemRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TaskViewModel::class.java))
            return TaskViewModel(repository) as T

        throw IllegalArgumentException("Unknown class for ViewModel")
    }
}