package com.example.tasquemanager.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.tasquemanager.enums.TasqueImportance
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Clock
import kotlin.time.ExperimentalTime

@Entity(tableName = "tasks")
class TasqueEntity @OptIn(ExperimentalTime::class) constructor(
    var title: String,
    var content: String?,
    var importance: TasqueImportance,
    var status: Boolean = false,
    var creationDate: LocalDate = Clock.System.now().toLocalDateTime(TimeZone.UTC).date,
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
)