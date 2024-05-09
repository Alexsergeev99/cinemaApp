package ru.alexsergeev.cinemaapp.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.alexsergeev.cinemaapp.user.User

@Entity
data class UserEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val eMail: String,
    val password: String,
    val name: String,
    val phone: String,
    ) {
    fun toDto() = User(id, eMail, password, name, phone)

    companion object {
    fun fromDto(user: User) = UserEntity(
        id = user.id,
        eMail = user.eMail,
       password = user.password,
        name = user.name,
        phone = user.phone
    )
    }

    fun List<UserEntity>.toDto(): List<User> = map(UserEntity::toDto)
    fun List<User>.toEntity(): List<UserEntity> = map { UserEntity.fromDto(it) }
}