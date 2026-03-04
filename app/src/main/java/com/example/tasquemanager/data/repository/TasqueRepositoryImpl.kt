package com.example.tasquemanager.data.repository

import com.example.tasquemanager.data.database.dao.TasqueDAO
import com.example.tasquemanager.data.model.local.TasqueEntity
import kotlinx.coroutines.flow.Flow

class TasqueRepositoryImpl(private val tasqueDAO: TasqueDAO) {
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