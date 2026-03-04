package com.example.tasquemanager.dto

import com.example.tasquemanager.enums.TasqueImportance

data class TasqueDTO(
    var title: String,
    var content: String? = null,
    var importance: TasqueImportance = TasqueImportance.NONE,
    var status: Boolean = false,
    var index: Int
)