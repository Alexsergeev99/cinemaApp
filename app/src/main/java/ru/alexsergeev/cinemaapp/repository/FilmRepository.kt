package ru.alexsergeev.cinemaapp.repository

import ru.alexsergeev.cinemaapp.user.User

interface FilmRepository {
 fun login(userNameLogin: String, userNamePassword: String): Boolean
}