package ru.alexsergeev.cinemaapp.viewmodel

import android.app.Application
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import ru.alexsergeev.cinemaapp.R
import ru.alexsergeev.cinemaapp.db.AppDb
import ru.alexsergeev.cinemaapp.repository.UserRepository
import ru.alexsergeev.cinemaapp.repository.UserRepositoryImpl
import ru.alexsergeev.cinemaapp.user.User

class UserViewModel(application: Application): AndroidViewModel(application) {

    val repository: UserRepository = UserRepositoryImpl(
        AppDb.getInstance(context = application).userDao)

    fun login(userNameLogin: String, userNamePassword: String): Boolean {
        return repository.login(userNameLogin, userNamePassword)
    }
    fun addUser(user: User) {
        repository.addUser(user)
    }
    fun getUserByLogin(login: String) {
        repository.getUserByLogin(login)
    }
    }
