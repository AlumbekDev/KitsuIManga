package com.example.kitsuimanga.presentation.ui.fragments.main.manga.detailed

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuimanga.R
import com.example.kitsuimanga.base.BaseFragment
import com.example.kitsuimanga.common.extentions.setImage
import com.example.kitsuimanga.databinding.FragmentMangaDetailedBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaDetailedFragment :
    BaseFragment<FragmentMangaDetailedBinding, MangaDetailedViewModel>(R.layout.fragment_manga_detailed) {
    override val binding by viewBinding(FragmentMangaDetailedBinding::bind)
    override val viewModel: MangaDetailedViewModel by viewModels()
    private val args: MangaDetailedFragmentArgs by navArgs()

    override fun setupRequest() {
        viewModel.fetchDetailedManga(args.id)
    }

    override fun setupObservers() {
        subscribeToDetailedManga()
    }

    private fun subscribeToDetailedManga() {
        viewModel.mangaDetailedState.collectUiState(
            success = {
                binding.apply {
                    it.apply {
                        imCover.setImage(data.mangaDto.coverImage?.original)
                        imPoster.setImage(data.mangaDto.posterImage.medium)
                        tvSubtype.text = data.mangaDto.subtype.uppercase()
                        tvYear.text = data.mangaDto.createdAt
                        tvTitle.text = data.mangaDto.titles.en
                        tvSynopsis.text = data.mangaDto.synopsis
                        tvAverageRating.text = "${data.mangaDto.averageRating}%"
                        tvRating.text = "Rank #${data.mangaDto.ratingRank}"
                        tvPopularity.text = "Rank #${data.mangaDto.popularityRank}"

                    }
                }
            }, error = { Log.e("tag", it) }
        )
    }
}