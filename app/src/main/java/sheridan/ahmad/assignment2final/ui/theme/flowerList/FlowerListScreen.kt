package sheridan.ahmad.assignment2final.ui.theme.flowerList

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import sheridan.ahmad.assignment2final.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FlowerListScreen(
    viewModel: FlowerListViewModel,
    modifier: Modifier = Modifier
){
    val state: State<FlowerListUiState> = viewModel.uiState
    val uiState: FlowerListUiState = state.value

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

    Scaffold(
        modifier = modifier, // You can keep this if you have specific modifier requirements.
        topBar = {
            FlowerDataTopAppBar(
                title = stringResource(R.string.list_title),
                canNavigateBack = false,
                scrollBehavior = scrollBehavior
            )
        }
    ) { innerPadding ->
        when (uiState) {
            is FlowerListUiState.Loaded -> ListBody(
                FlowerList = uiState.flower,
                modifier = modifier.padding(innerPadding)
            )

        }
    }
}


