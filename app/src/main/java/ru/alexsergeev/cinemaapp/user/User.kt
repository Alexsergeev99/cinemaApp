package ru.alexsergeev.cinemaapp.user

data class User(
    val id: Long,
    val eMail: String,
    val password: String,
    val name: String,
    val phone: String
)