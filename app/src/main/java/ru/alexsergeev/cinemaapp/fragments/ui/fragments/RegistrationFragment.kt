package ru.alexsergeev.cinemaapp.fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import ru.alexsergeev.cinemaapp.R
import ru.alexsergeev.cinemaapp.databinding.FragmentRegistrationBinding
import ru.alexsergeev.cinemaapp.databinding.FragmentStartedPageBinding
import ru.alexsergeev.cinemaapp.viewmodel.FilmViewModel

class RegistrationFragment : Fragment() {
    private val viewModel: FilmViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRegistrationBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }
}