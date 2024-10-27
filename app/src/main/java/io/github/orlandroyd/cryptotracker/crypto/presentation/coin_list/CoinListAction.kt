package io.github.orlandroyd.cryptotracker.crypto.presentation.coin_list

import io.github.orlandroyd.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction
}