package com.victorcodonho.nearby.ui.screen.home

import com.google.android.gms.maps.model.LatLng
import com.victorcodonho.nearby.data.model.Category
import com.victorcodonho.nearby.data.model.Market

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocation: List<LatLng>? = null
)