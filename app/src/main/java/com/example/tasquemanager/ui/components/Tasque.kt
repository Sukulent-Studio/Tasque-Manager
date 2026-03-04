package com.example.tasquemanager.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tasquemanager.dto.TasqueDTO


@Composable
fun Tasque(task: TasqueDTO, modifier: Modifier = Modifier) {
    val (checkedState, onStateChange) = remember { mutableStateOf(false) }
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Checkbox(checked = checkedState,
            onCheckedChange = { onStateChange(!checkedState); removeTasque(task.index) },
            modifier = modifier.size(20.dp)
        )
        Text(task.title)
    }
}

@Preview(
    showBackground = true,
    widthDp = 412,
)
@Composable
fun TasqueExample() {
    val task = TasqueDTO(
        "Task",
        index = 23
    )
    Tasque(task)
}


fun removeTasque(index: Int) {

}