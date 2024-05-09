package ru.alexsergeev.cinemaapp.repository

import ru.alexsergeev.cinemaapp.entity.UserEntity
import ru.alexsergeev.cinemaapp.user.User

interface UserRepository {
    fun login(userNameLogin: String, userNamePassword: String): Boolean
    fun addUser(user: User)
    suspend fun getUserByLogin(login: String): UserEntity?
}