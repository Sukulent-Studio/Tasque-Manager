package com.example.tasquemanager.presentation.feature_tasks.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasquemanager.data.model.local.TasqueEntity
import com.example.tasquemanager.domain.value.TasqueImportance
import com.example.tasquemanager.presentation.theme.inner_indent
import com.example.tasquemanager.presentation.theme.separating_indent

@Composable
fun TasqueGroup(title: String, tasks: ArrayList<TasqueEntity>, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(separating_indent),
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(all = inner_indent)
    ) {
        Text(title, fontSize = 20.sp)
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            for (task in tasks) {
                Tasque(task)
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 412,
)
@Composable
fun TasqueGroupExample() {
    val task = TasqueEntity(
        "Something",
        null,
        id = 12,
        importance = TasqueImportance.LOW
    )
    TasqueGroup(
        "Tasks",
        arrayListOf(task)
    )
}