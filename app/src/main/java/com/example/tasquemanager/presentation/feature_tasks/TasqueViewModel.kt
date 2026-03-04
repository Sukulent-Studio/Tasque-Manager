package com.example.tasquemanager.presentation.feature_tasks

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.tasquemanager.data.model.local.TasqueEntity
import com.example.tasquemanager.data.repository.TasqueRepositoryImpl
import kotlinx.coroutines.launch

class TasqueViewModel(private val repository: TasqueRepositoryImpl): ViewModel() {
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