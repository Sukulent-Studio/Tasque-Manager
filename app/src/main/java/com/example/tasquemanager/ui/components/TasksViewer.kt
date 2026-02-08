package com.example.tasquemanager.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.tasquemanager.dto.TasqueDTO
import androidx.compose.ui.Modifier
import com.example.tasquemanager.ui.theme.combine_indent
import com.example.tasquemanager.ui.theme.vertical_indent

@Composable
fun TasksViewer(
    modifier: Modifier = Modifier,
    dataGetter: () -> LinkedHashMap<String, ArrayList<TasqueDTO>>
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(combine_indent),
        modifier = Modifier.padding(top = vertical_indent)
    ){
        for ((group, tasks) in dataGetter()) {
            item { TasqueGroup(group, tasks) }
        }
    }
}