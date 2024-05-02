package ru.alexsergeev.cinemaapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ru.alexsergeev.cinemaapp.dao.UserDao
import ru.alexsergeev.cinemaapp.entity.UserEntity


@Database(entities = [UserEntity::class], version = 1)
abstract  class AppDb : RoomDatabase() {
    abstract  val userDao: UserDao

    companion object {
        @Volatile
        private var instance: AppDb? = null

        fun getInstance(context: Context): AppDb {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context, AppDb::class.java, "app.db").
            allowMainThreadQueries().
            build()
    }
}