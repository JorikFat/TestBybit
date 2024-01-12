package dev.jorik.test.bybit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dev.jorik.test.bybit.ui.EmptyScreen
import dev.jorik.test.bybit.ui.ListScreen
import dev.jorik.test.bybit.ui.WaitScreen
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
    viewModel: MainViewModel
) {
    val _state by viewModel.items.collectAsStateWithLifecycle()
    when (val state = _state) {
        State.Loading -> WaitScreen()
        is State.Data -> ListScreen(state)
        is State.Error -> EmptyScreen(state, if(state.retry) viewModel::retry else null)
    }
}
