package ru.alexsergeev.cinemaapp.fragments.ui.fragments

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import ru.alexsergeev.cinemaapp.R
import ru.alexsergeev.cinemaapp.databinding.FragmentLoginBinding
import ru.alexsergeev.cinemaapp.viewmodel.FilmViewModel

//import ru.alexsergeev.cinemaapp.fragments.R

class LoginFragment : Fragment() {

    private val viewModel: FilmViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLoginBinding.inflate(
            inflater,
            container,
            false
        )
        val usernameEditText = binding.username
        val passwordEditText = binding.password
        val loginButton = binding.login
        val loadingProgressBar = binding.loading
        val createAccountButton = binding.createAccount

        loginButton.setOnClickListener {
            loadingProgressBar.visibility = View.VISIBLE
            Toast.makeText(context, "OK", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_loginFragment_to_startedPage)
//            viewModel.login(
//                usernameEditText.text.toString(),
//                passwordEditText.text.toString()
//            )
        }

        return binding.root
    }

}