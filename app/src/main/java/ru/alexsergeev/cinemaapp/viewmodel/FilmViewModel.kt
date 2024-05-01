package ru.alexsergeev.cinemaapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import ru.alexsergeev.cinemaapp.repository.FilmRepository
import ru.alexsergeev.cinemaapp.repository.FilmRepositoryImpl

class FilmViewModel(application: Application): AndroidViewModel(application) {

    private val repository: FilmRepository = FilmRepositoryImpl()

  fun login(userNameLogin: String, userNamePassword: String): Boolean {
      return repository.login(userNameLogin, userNamePassword)
  }
//fun login(userNameLogin: String, userNamePassword: String): Boolean {
//    if (userNamePassword.length < 5) return false else return true
//}
}