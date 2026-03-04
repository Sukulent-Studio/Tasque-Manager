package com.example.tasquemanager.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tasquemanager.data.model.local.TasqueEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TasqueDAO {
    @Query("SELECT * FROM tasks")
    fun getAllTasks(): Flow<List<TasqueEntity>>

    @Insert(onConflict = OnConflictStrategy.Companion.IGNORE)
    fun addTasque(tasque: TasqueEntity)
}