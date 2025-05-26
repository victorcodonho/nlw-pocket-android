package com.victorcodonho.nearby.ui.screen.market_details

import com.victorcodonho.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null
)