package ru.alexsergeev.cinemaapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ru.alexsergeev.cinemaapp.entity.UserEntity
import ru.alexsergeev.cinemaapp.user.User

@Dao
interface UserDao {

    @Insert
    fun insert(user: UserEntity)

    @Query("UPDATE UserEntity SET password = :password WHERE id = :id")
    fun changePasswordById(id: Long, password: String)
    fun save(user: UserEntity) = if(user.id == 0L) insert(user) else changePasswordById(user.id, user.password)
}