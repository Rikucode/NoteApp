package com.rikugou.noteapp

import android.app.Application

class NoteApplication:Application() {
    private val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRepository(database.taskItemDao())}
}