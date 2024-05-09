package ru.alexsergeev.cinemaapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
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
    suspend fun getUserByLogin(login: String) {
        repository.getUserByLogin(login)
    }
}