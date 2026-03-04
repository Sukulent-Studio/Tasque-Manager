package com.example.tasquemanager.db.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.tasquemanager.db.converter.LocalDateConverter
import com.example.tasquemanager.db.dao.TasqueDAO
import com.example.tasquemanager.db.entity.TasqueEntity

@Database(
    version = 1,
    entities = [
        TasqueEntity::class
    ]
)
@TypeConverters(LocalDateConverter::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getTasqueDao(): TasqueDAO
    companion object {
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "AppDatabase"
                    ).fallbackToDestructiveMigration(false).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}