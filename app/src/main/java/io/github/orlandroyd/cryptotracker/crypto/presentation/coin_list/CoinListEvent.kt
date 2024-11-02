package io.github.orlandroyd.cryptotracker.crypto.presentation.coin_list

import io.github.orlandroyd.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}