package com.victorcodonho.nearby.ui.screen.home

sealed class HomeUiEvent {
    data object onFetchCategories: HomeUiEvent()
    data class onFetchMarkets(val categoryId: String): HomeUiEvent()
}