package com.gclewis.chapter.two

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class RetirementCalculatorTest {
    @Test
    fun testUserCanRetireInTheFuture() {
        val retirementCalculator = RetirementCalculator(25, 65)
        val currentDate = LocalDateTime.now()
        assertEquals("It's ${currentDate.year}, so you can retire in ${currentDate.year + 40}", retirementCalculator.calc())
    }

    @Test
    fun testUserCouldHaveRetiredInThePast() {
        val retirementCalculator = RetirementCalculator(68, 65)
        val currentDate = LocalDateTime.now()
        assertEquals("It's ${currentDate.year}, so you should have retired in ${currentDate.year - 3}", retirementCalculator.calc())
    }

    @Test
    fun testUserCanRetireThisYear() {
        val retirementCalculator = RetirementCalculator(65, 65)
        val currentDate = LocalDateTime.now()
        assertEquals("It's ${currentDate.year}, so you can retire this year!", retirementCalculator.calc())
    }
}