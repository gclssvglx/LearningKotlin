package com.gclewis.chapter.two

import java.time.LocalDateTime

class RetirementCalculator(private val currentAge: Int, private val retirementAge: Int) {
    fun calc(): String {
        val currentDate = LocalDateTime.now()
        val currentYear = currentDate.year
        val retirementYear = currentYear + (retirementAge - currentAge)
        return when {
            (retirementYear < currentYear) -> "It's $currentYear, so you should have retired in $retirementYear"
            (retirementYear == currentYear) -> "It's $currentYear, so you can retire this year!"
            else -> "It's $currentYear, so you can retire in $retirementYear"
        }
    }
}
