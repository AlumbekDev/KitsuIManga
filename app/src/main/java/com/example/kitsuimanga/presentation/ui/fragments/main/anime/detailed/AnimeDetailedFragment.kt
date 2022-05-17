package com.example.kitsuimanga.presentation.ui.fragments.main.anime.detailed

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuimanga.R
import com.example.kitsuimanga.base.BaseFragment
import com.example.kitsuimanga.common.extentions.setImage
import com.example.kitsuimanga.databinding.FragmentAnimeDetailedBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeDetailedFragment :
    BaseFragment<FragmentAnimeDetailedBinding, AnimeDetailedViewModel>(R.layout.fragment_anime_detailed) {
    override val binding by viewBinding(FragmentAnimeDetailedBinding::bind)
    override val viewModel: AnimeDetailedViewModel by viewModels()
    private val args: AnimeDetailedFragmentArgs by navArgs()

    override fun setupRequest() {
        viewModel.fetchADetailedAnime(args.id)
    }

    override fun setupObservers() {
        subscribeToAnimeDetailed()
        showCategoryChips()

    }

    private fun showCategoryChips() {

    }

    private fun subscribeToAnimeDetailed() {
        viewModel.animeDetailedState.collectUiState(success = {
            binding.apply {
                it.apply {
                    ivCover.setImage(data.animeDto.coverImage?.original)
                    imPoster.setImage(data.animeDto.posterImage?.medium)
                    tvSubtype.text = data.animeDto.subtype?.uppercase()
                    tvYear.text = data.animeDto.createdAt
                    tvTitle.text = data.animeDto.titles?.en
                    tvSynopsis.text = data.animeDto.synopsis
                    tvAverageRating.text = "${data.animeDto.averageRating}%"
                    tvRating.text = "Rank #${data.animeDto.ratingRank}"
                    tvPopularity.text = "Rank #${data.animeDto.popularityRank}"
                }
            }
        }, error = { Log.e("tag", it) }
        )
    }

    override fun setupListeners() {
        openVideo()
    }

    private fun openVideo() {
        binding.btnYoutubeVideo.setOnClickListener{
            this.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:${args.trailerId}")))
        }

    }
}