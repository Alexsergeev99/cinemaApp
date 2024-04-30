package ru.alexsergeev.cinemaapp.fragments.ui.login

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.activityViewModels
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

        loginButton.setOnClickListener {
            loadingProgressBar.visibility = View.VISIBLE
//            viewModel.login(
//                usernameEditText.text.toString(),
//                passwordEditText.text.toString()
//            )
        }

        return binding.root
    }

}