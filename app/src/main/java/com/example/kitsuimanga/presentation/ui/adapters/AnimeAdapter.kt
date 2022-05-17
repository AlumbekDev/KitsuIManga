package com.example.kitsuimanga.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuimanga.base.BaseDiffUtil
import com.example.kitsuimanga.common.extentions.setImage
import com.example.kitsuimanga.databinding.ItemAnimeBinding
import com.example.kitsuimanga.presentation.models.anime.AnimeDataUI

class AnimeAdapter(
    private val onClick: (id: String, trailerId: String?) -> Unit,
) :
    PagingDataAdapter<AnimeDataUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {
    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(ui: AnimeDataUI) {
            binding.imAnime.setImage(ui.animeDto.posterImage?.original)
            binding.root.setOnClickListener {
                onClick(ui.id, ui.animeDto.youtubeVideoId)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            (ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }

    }
}