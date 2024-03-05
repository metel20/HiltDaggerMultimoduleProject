package com.metel20.data

import com.metel20.domain.QuoteRepository
import javax.inject.Inject


class BaseRepository @Inject constructor(
    private val service: AnimeQuoteService
) : QuoteRepository {

    override suspend fun loadQuote(): Pair<Boolean, String> {
        return try {
            val quote = service.animeQuote().quote
            Pair(true, quote)

        } catch (e: Exception) {
            Pair(false, e.message ?: "error")

        }

    }
}
