package com.example.tasquemanager.db.repo

import androidx.lifecycle.LiveData
import com.example.tasquemanager.db.dao.TasqueDAO
import com.example.tasquemanager.db.entity.TasqueEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class TasqueRepository(private val tasqueDAO: TasqueDAO) {
//    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    val tasqueList: Flow<List<TasqueEntity>> = tasqueDAO.getAllTasks()

//     fun addTasque(tasque: TasqueEntity) {
//        coroutineScope.launch(Dispatchers.IO) {
//            tasqueDAO.addTasque(tasque)
//        }
//    }

    suspend fun addTasque(tasque: TasqueEntity) {
        tasqueDAO.addTasque(tasque)
    }
}