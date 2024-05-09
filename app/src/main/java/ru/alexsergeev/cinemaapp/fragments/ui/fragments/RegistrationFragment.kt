package ru.alexsergeev.cinemaapp.fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import ru.alexsergeev.cinemaapp.R
import ru.alexsergeev.cinemaapp.databinding.FragmentRegistrationBinding
import ru.alexsergeev.cinemaapp.databinding.FragmentStartedPageBinding
import ru.alexsergeev.cinemaapp.user.User
import ru.alexsergeev.cinemaapp.viewmodel.FilmViewModel
import ru.alexsergeev.cinemaapp.viewmodel.UserViewModel

class RegistrationFragment : Fragment() {
    private val viewModel: UserViewModel by activityViewModels()
    var users = mutableListOf<User>()
    var newId = 0
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
        binding.createNewAccount.setOnClickListener {
            viewModel.addUser(User(
                id = newId++.toLong(),
                eMail = binding.usernameReg.toString(),
                password = binding.passwordReg.toString(),
                name = binding.nameReg.toString(),
                phone = binding.phoneReg.toString()
            ))
            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        }
        return binding.root
    }
}