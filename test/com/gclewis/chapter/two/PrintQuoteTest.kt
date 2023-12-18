package com.gclewis.chapter.two

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PrintQuoteTest {
    @Test
    fun testQuoteWithAuthor() {
        val printQuote = PrintQuote()
        val actual = printQuote.print("These aren't the droids you're looking for.", "Obi-Wan Kenobi")
        assertEquals("Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"", actual)
    }
}