package com.rikugou.noteapp

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.rikugou.noteapp.databinding.TaskItemCellBinding

class TaskItemViewHolder(
    private val context: Context,
    private val binding: TaskItemCellBinding
): RecyclerView.ViewHolder(binding.root) {
}