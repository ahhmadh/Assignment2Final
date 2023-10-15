package sheridan.ahmad.assignment2final.ui.theme.flowerList

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sheridan.ahmad.assignment2final.Local.fakeFLowerList

class FlowerListViewModel: ViewModel() {

    private val _uiState: MutableState<FlowerListUiState> =
        mutableStateOf(FlowerListUiState.Loaded(fakeFLowerList))
    val uiState: State<FlowerListUiState> = _uiState

}

