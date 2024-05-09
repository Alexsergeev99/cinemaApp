package ru.alexsergeev.cinemaapp.repository

import ru.alexsergeev.cinemaapp.dao.UserDao
import ru.alexsergeev.cinemaapp.entity.UserEntity
import ru.alexsergeev.cinemaapp.user.User

class UserRepositoryImpl(private val dao: UserDao): UserRepository {
    override fun login(userNameLogin: String, userNamePassword: String): Boolean {
        return userNamePassword.length >= 5 //&& getUserByLogin(userNameLogin.toString()) != null
    }

    override fun addUser(user: User) {
        dao.insert(UserEntity.fromDto(user))
    }

    override suspend fun getUserByLogin(login: String): UserEntity? {
           return dao.getUserByLogin(login)
    }
}