package com.rikugou.noteapp

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class TaskItemRepository(private val taskItemDao: taskItemDao) {
    val allTaskItems: Flow<TaskItem> = taskItemDao.allTaskItems()

    @WorkerThread
    suspend fun insertTaskItem (taskItem: TaskItem)
    {
        taskItemDao.insertTaskItem(taskItem)
    }

    @WorkerThread
    suspend fun updateTaskItem (taskItem: TaskItem)
    {
        taskItemDao.updateTaskItem(taskItem)
    }
    
    @WorkerThread
    suspend fun deleteTaskItem (taskItem: TaskItem)
    {
        taskItemDao.deleteTaskItem(taskItem)
    }
}