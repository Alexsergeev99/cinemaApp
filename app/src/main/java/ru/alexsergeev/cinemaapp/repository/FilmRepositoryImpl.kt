package ru.alexsergeev.cinemaapp.repository

class FilmRepositoryImpl(): FilmRepository {
    override  fun login(userNameLogin: String, userNamePassword: String): Boolean {
        if (userNamePassword.length < 5) return false else return true
    }
}