package com.example.tasquemanager.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tasquemanager.dto.TasqueDTO
import com.example.tasquemanager.ui.components.HeadBar
import com.example.tasquemanager.ui.components.TasksViewer
import com.example.tasquemanager.ui.theme.horizontal_indent
import com.example.tasquemanager.ui.theme.vertical_indent


@Preview(
    showBackground = true,
    widthDp = 412,
    heightDp = 877
)
@Composable
fun TasksScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = horizontal_indent)
            .padding(top = vertical_indent)
    ) {
        HeadBar("Tasks")
        TasksViewer {
            val task = TasqueDTO(
                "Something",
                null,
                index = 12U
            )
            return@TasksViewer linkedMapOf("Fever" to arrayListOf(task))
        }
    }
}