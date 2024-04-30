package ru.alexsergeev.cinemaapp.fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import ru.alexsergeev.cinemaapp.R
import ru.alexsergeev.cinemaapp.databinding.FragmentStartedPageBinding
import ru.alexsergeev.cinemaapp.viewmodel.FilmViewModel

class StartedPage : Fragment() {
    private val viewModel: FilmViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentStartedPageBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }
}