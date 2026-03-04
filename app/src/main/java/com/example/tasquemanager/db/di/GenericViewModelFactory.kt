package com.example.tasquemanager.db.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tasquemanager.db.viewmodels.TasqueViewModel

class GenericViewModelFactory(private val application: MyApplication): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(TasqueViewModel::class.java) -> {
                TasqueViewModel(application.tasqueRepository) as T
            }
            else -> throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
        }
    }
}