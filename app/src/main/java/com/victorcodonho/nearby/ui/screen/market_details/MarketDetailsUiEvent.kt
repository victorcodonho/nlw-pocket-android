package com.victorcodonho.nearby.ui.screen.market_details

sealed class MarketDetailsUiEvent {
    data class onFetchRules(val marketId: String): MarketDetailsUiEvent()
    data class onFetchCoupon(val qrCodeContent: String): MarketDetailsUiEvent()
    data object onResetCoupon: MarketDetailsUiEvent()
}