package sheridan.ahmad.assignment2final.ui.theme.flowerList

import sheridan.ahmad.assignment2final.Domain.Flower

sealed interface FlowerListUiState{
    data class Loaded(val flower: List<Flower>): FlowerListUiState
}