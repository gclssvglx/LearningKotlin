package com.gclewis.chapter.two

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CharCountTest {
    @Test
    fun testZeroLengthString() {
        val charCount = CharCount()
        assertEquals("[] has [0] characters", charCount.count(""))
    }

    @Test
    fun testAlphabeticString() {
        val charCount = CharCount()
        assertEquals("[Fred] has [4] characters", charCount.count("Fred"))
    }

    @Test
    fun testAlphaNumericString() {
        val charCount = CharCount()
        assertEquals("[Fred 42] has [7] characters", charCount.count("Fred 42"))
    }
}