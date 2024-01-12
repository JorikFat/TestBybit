package dev.jorik.test.bybit.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.jorik.test.bybit.Item
import dev.jorik.test.bybit.State
import dev.jorik.test.bybit.Type

@Composable
fun Item.Ui() {
    Card(modifier = Modifier.padding(4.dp)) {
        Column(modifier = Modifier.padding(8.dp)) {
            Row {
                Text(type.key)
                Spacer(Modifier.width(8.dp))
                Text(title)
            }
            Text(description)
            Row {
                tags.forEach {
                    Text(it)
                    Spacer(Modifier.width(8.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemPreview() {
    Item(
        "title",
        "description",
        Type("", "123"),
        listOf("one", "two", "three"),
        "",
        0L,
        0L,
        0L
    ).Ui()
}

@Composable
fun EmptyScreen(
    state :State.Error,
    onClick: (() -> Unit)? = null
) {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxSize()
    ) {
        onClick
            ?.let {
                Snackbar(
                    modifier = Modifier.padding(8.dp),
                    containerColor = Color.Red,
                    action = {
                        Button(onClick = it){
                            Text("Повторить")
                        }
                    }
                ) {
                    Text(state.exception.message!!)
                }
            }
            ?: Snackbar(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(state.exception.message!!)
            }
    }
}

@Preview(showBackground = true)
@Composable
fun EmptyScreenPreview(){
    EmptyScreen(State.Error(Exception("Stub Error")), onClick = {})
}

@Composable
fun WaitScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        CircularProgressIndicator()
    }
}

@Preview(showBackground = true)
@Composable
fun WaitScreenPreview() {
    WaitScreen()
}

@Composable
fun ListScreen(state: State.Data) {
    LazyColumn(
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        items(items = state.items) {
            it.Ui()
        }
    }
}