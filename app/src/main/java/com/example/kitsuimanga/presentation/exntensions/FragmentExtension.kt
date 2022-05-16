package com.example.kitsuimanga.presentation.exntensions

import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.kitsuimanga.R

fun Fragment.mainNavController() =
    requireActivity().findNavController(R.id.nav_host_fragment)