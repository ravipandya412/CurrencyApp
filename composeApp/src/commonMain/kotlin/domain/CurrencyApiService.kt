package domain.model

interface CurrencyApiService {
    fun getLatestExchangeRates(): RequestState<List<Currency>>
}