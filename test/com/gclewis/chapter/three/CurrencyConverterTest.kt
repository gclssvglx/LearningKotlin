package com.gclewis.chapter.three

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CurrencyConverterTest {
    @Test
    fun testBasicConversion() {
        val currencyConverter = CurrencyConverter("EUR")
        assertEquals(1.15, currencyConverter.convert(1.0))
    }

    @Test
    fun testComplexConversion() {
        val currencyConverter = CurrencyConverter("EUR")
        assertEquals(93.14999999999999, currencyConverter.convert(81.0))
    }
}