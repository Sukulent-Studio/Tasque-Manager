package com.example.tasquemanager.data.database.converter

import androidx.room.TypeConverter
import kotlinx.datetime.LocalDate

object LocalDateConverter {

    @TypeConverter
    fun fromString(value: String?): LocalDate? {
        return value?.let { LocalDate.parse(it) } // ISO формат по умолчанию
    }

    @TypeConverter
    fun toString(value: LocalDate?): String? {
        return value?.toString() // ISO строка
    }
}