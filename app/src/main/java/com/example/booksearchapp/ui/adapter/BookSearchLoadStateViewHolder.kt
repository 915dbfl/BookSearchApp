package com.example.booksearchapp.ui.adapter

import androidx.core.view.isInvisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.example.booksearchapp.databinding.ItemLoadStateBinding

class BookSearchLoadStateViewHolder(
    private val binding: ItemLoadStateBinding,
    retry: () -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.btnRetry.setOnClickListener {
            retry.invoke()
        }
    }

    fun bind(loadState: LoadState) {
        if (loadState is LoadState.Error) {
            binding.tvError.text = "Error occurred"
        }

        binding.progressBar.isInvisible = loadState is LoadState.Loading
        binding.tvError.isInvisible = loadState is LoadState.Error
        binding.btnRetry.isInvisible = loadState is LoadState.Error
    }
}