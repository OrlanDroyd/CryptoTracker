package io.github.orlandroyd.cryptotracker.crypto.domain

import io.github.orlandroyd.cryptotracker.core.domain.util.NetworkError
import io.github.orlandroyd.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}