package com.example.tasquemanager

import android.R
import com.example.tasquemanager.ui.theme.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.IconButton
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.tasquemanager.ui.theme.TasqueManagerTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.composed

import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.semantics.Role

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TasqueManagerTheme {
                taskScreen()
            }
        }
    }
}

//@Preview(
//    showBackground = true,
//    widthDp = 412,
//    heightDp = 877
//)
//@Composable
//fun loadScreen(modifier: Modifier = Modifier) {
//    Surface(
//        color = MaterialTheme.colorScheme.primary
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.load),
//            contentDescription = "load",
//            modifier = Modifier.padding(horizontal = 80.dp).fillMaxSize()
//        )
//    }
//}

var taskList: ArrayList<String> = arrayListOf("sadsadds", "sadsadds")

@Preview(
    showBackground = true,
    widthDp = 412,
    heightDp = 877
)
@Composable
fun taskScreen(): Unit {
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = horizontal_indent)
            .padding(top = vertical_indent),
    ) {
        headBar(
            "Задачи",
            modifier = Modifier

        )

        Column(
            verticalArrangement = Arrangement.spacedBy(combine_indent),
            modifier = Modifier.verticalScroll(rememberScrollState())
                .padding(top = vertical_indent)
        ){

            tasqueBlock()

        }
    }
}

@Composable
fun headBar(name: String, modifier: Modifier = Modifier): Unit {
    Row(verticalAlignment = Alignment.CenterVertically) {

        Text(
            name,
            fontSize = 24.sp,
            modifier = Modifier.weight(1f)
        )

        IconButton(
            onClick = {},
            modifier = Modifier.size(44.dp)
        ) {
            Icon(
                painter = rememberVectorPainter(image = Icons.Default.MoreVert),
                contentDescription = "menu",
                modifier = Modifier.size(size = 28.dp)
            )
        }
    }
}


@Composable
fun tasqueBlock(): Unit {
    Column(
        verticalArrangement = Arrangement.spacedBy(separating_indent),
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(all = inner_indent)
    ) {
        Text("Набор задач", fontSize = 20.sp)
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            for (i in taskList) {
                tasque(i)
            }
        }
    }
}
@Preview(
    showBackground = true,
    widthDp = 412,
)
@Composable
fun tasque(name: String = "Задача", modifier: Modifier = Modifier): Unit {
    val (checkedState, onStateChange) = remember { mutableStateOf(false) }
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
            .toggleable(
                value = checkedState,
                onValueChange = { onStateChange(!checkedState) },
                role = Role.Checkbox
            )
    ) {
        Checkbox(checked = checkedState, onCheckedChange = null, modifier = modifier.size(20.dp))
        Text(name)
    }
}

@Composable
fun addButton(modifier: Modifier): Unit {

}

@Composable
fun navBar(modifier: Modifier): Unit {

}