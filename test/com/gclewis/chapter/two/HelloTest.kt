package com.gclewis.chapter.two

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HelloTest {
    @Test
    fun testHiFred() {
        val hello = Hello()
        assertEquals("Hi Fred!", hello.hi("Fred"))
    }

    @Test
    fun testHiBarney() {
        val hello = Hello()
        assertEquals("Hi Barney!", hello.hi("Barney"))
    }

    @Test
    fun testHiEmptyString() {
        val hello = Hello()
        assertEquals("Hi !", hello.hi(""))
    }

    @Test
    fun testHiNoName() {
        val hello = Hello()
        assertEquals("Hi Anonymous!", hello.hi())
    }
}
