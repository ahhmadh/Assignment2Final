package sheridan.ahmad.assignment2final.ui.theme

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import sheridan.ahmad.assignment2final.ui.theme.flowerList.FlowerListScreen
import sheridan.ahmad.assignment2final.ui.theme.flowerList.FlowerListViewModel

@Composable
fun AppScreen(){
    val viewModel: FlowerListViewModel = viewModel()

    FlowerListScreen(viewModel)
}
