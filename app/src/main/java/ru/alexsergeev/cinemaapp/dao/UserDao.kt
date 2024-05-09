package ru.alexsergeev.cinemaapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.alexsergeev.cinemaapp.entity.UserEntity
import ru.alexsergeev.cinemaapp.user.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(user: UserEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(users: List<UserEntity>)

    @Query("UPDATE UserEntity SET password = :password WHERE id = :id")
    fun changePasswordById(id: Long, password: String)
    fun save(user: UserEntity) = if(user.id == 0L) insert(user) else changePasswordById(user.id, user.password)

    @Query("SELECT * FROM UserEntity WHERE eMail = :login")
    suspend fun getUserByLogin(login: String): UserEntity
}