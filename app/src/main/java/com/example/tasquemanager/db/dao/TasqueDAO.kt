package com.example.tasquemanager.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tasquemanager.db.entity.TasqueEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TasqueDAO {
    @Query("SELECT * FROM tasks")
    fun getAllTasks(): Flow<List<TasqueEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addTasque(tasque: TasqueEntity)
}