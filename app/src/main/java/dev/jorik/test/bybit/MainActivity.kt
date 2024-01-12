package dev.jorik.test.bybit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dev.jorik.test.bybit.ui.theme.TestBybitTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestBybitTheme {
                Screen(viewModel = koinViewModel())
            }
        }
    }
}

@Composable
private fun Screen(
    viewModel :MainViewModel
){
    val items by viewModel.items.collectAsStateWithLifecycle()
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = items) {
            it.Ui()
        }
    }
}

@Composable
private fun Item.Ui() {
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
private fun ItemPreview(){
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