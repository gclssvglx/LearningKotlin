package com.gclewis.chapter.three

class CurrencyConverter(private val currency: String) {
    fun convert(amount: Double): Double? {
        val conversionRates = CurrencyConversionRates()
        val rate = conversionRates.rates[currency]
        return rate?.times(amount)
    }
}
