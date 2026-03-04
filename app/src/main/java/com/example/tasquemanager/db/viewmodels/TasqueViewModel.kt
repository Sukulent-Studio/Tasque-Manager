package com.example.tasquemanager.db.viewmodels

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.tasquemanager.db.database.AppDatabase
import com.example.tasquemanager.db.entity.TasqueEntity
import com.example.tasquemanager.db.repo.TasqueRepository
import kotlinx.coroutines.launch

class TasqueViewModel(private val repository: TasqueRepository): ViewModel() {
    val tasqueList: LiveData<List<TasqueEntity>> = repository.tasqueList.asLiveData()

//    init {
//        val appDB = AppDatabase.getInstance(application)
//        val tasqueDAO = appDB.getTasqueDao()
//        repository = TasqueRepository(tasqueDAO)
//        tasqueList = repository.tasqueList
//    }

    fun addTasque(tasque: TasqueEntity) {
        viewModelScope.launch {
            repository.addTasque(tasque)
        }
    }

}