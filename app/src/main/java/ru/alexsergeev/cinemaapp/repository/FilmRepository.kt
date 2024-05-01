package ru.alexsergeev.cinemaapp.repository

interface FilmRepository {
 fun login(userNameLogin: String, userNamePassword: String): Boolean

}