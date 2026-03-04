package com.example.tasquemanager.presentation.feature_tasks

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tasquemanager.data.model.remote.TasqueDTO
import com.example.tasquemanager.presentation.common.HeadBar
import com.example.tasquemanager.presentation.feature_tasks.components.TasksViewer
import com.example.tasquemanager.presentation.theme.horizontal_indent
import com.example.tasquemanager.presentation.theme.vertical_indent


@Composable
fun TasksScreen(
    modifier: Modifier = Modifier,
//    appContext: Context = LocalContext.current.applicationContext,
    dataGetter: () -> LinkedHashMap<String, ArrayList<TasqueDTO>>
    ) {



    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = horizontal_indent)
            .padding(top = vertical_indent)
    ) {
        HeadBar("Tasks")
        TasksViewer(tasks = dataGetter())
    }
}

@Preview(
    showBackground = true,
    widthDp = 412,
    heightDp = 877
)
@Composable
fun TasksScreenExample() {
    TasksScreen {
        val task = TasqueDTO(
            "Something",
            null,
            index = 12
        )
        return@TasksScreen linkedMapOf(
            "Fever" to arrayListOf(task),
            "Yuo" to arrayListOf(task, task),
            "sds" to arrayListOf())
    }
}