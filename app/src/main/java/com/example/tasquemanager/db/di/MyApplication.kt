package com.example.tasquemanager.db.di

import android.app.Application
import com.example.tasquemanager.db.database.AppDatabase
import com.example.tasquemanager.db.repo.TasqueRepository

class MyApplication: Application() {
    val database by lazy { AppDatabase.getInstance(this) }

    val tasqueRepository by lazy { TasqueRepository(database.getTasqueDao()) }
}