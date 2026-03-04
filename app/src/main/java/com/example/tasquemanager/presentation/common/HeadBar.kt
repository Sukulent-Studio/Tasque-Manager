package com.example.tasquemanager.presentation.common

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeadBar(title: String, modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            title,
            fontSize = 24.sp,
            modifier = Modifier.weight(1f)
        )

        IconButton(
            onClick = {},
            modifier = Modifier.size(44.dp)
        ) {
            Icon(
                painter = rememberVectorPainter(image = Icons.Rounded.MoreVert),
                contentDescription = "menu",
                modifier = Modifier.size(size = 28.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 412,
)
@Composable
fun HeadBarExample() {
    HeadBar("Example")
}