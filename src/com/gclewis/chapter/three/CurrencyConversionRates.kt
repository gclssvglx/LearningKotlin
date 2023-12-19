package com.gclewis.chapter.three

data class CurrencyConversionRates(
    var rates: Map<String, Double> = mapOf(
        "USD" to 1.27,
        "EUR" to 1.15
    )
)
