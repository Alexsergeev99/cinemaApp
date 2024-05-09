package ru.alexsergeev.cinemaapp.repository

class FilmRepositoryImpl(): FilmRepository {
    override fun login(userNameLogin: String, userNamePassword: String): Boolean {
        return userNamePassword.length >= 5
    }
}