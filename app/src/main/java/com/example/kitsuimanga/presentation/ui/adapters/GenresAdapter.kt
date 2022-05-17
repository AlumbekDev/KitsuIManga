package com.example.kitsuimanga.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuimanga.base.BaseDiffUtil
import com.example.kitsuimanga.databinding.ItemGenresBinding
import com.example.kitsuimanga.presentation.models.genres.DataItemUi

class GenresAdapter :
    androidx.recyclerview.widget.ListAdapter<DataItemUi, GenresAdapter.GenresViewHolder>(
        BaseDiffUtil()) {
    inner class GenresViewHolder(private val binding: ItemGenresBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(dataItemUi: DataItemUi) {
            binding.tvGenre.text = dataItemUi.attributes.name

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenresViewHolder {
        return GenresViewHolder(ItemGenresBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: GenresViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }
}