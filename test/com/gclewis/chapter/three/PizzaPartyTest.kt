package com.gclewis.chapter.three

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PizzaPartyTest {
    @Test
    fun test8People2Pizzas8Slices() {
        val pizzaParty = PizzaParty(8, 2, 8)
        assertEquals("Each person gets 2 slices with 0 slices leftover", pizzaParty.partyOn())
    }

    @Test
    fun test8People2Pizzas4Slices() {
        val pizzaParty = PizzaParty(8, 2, 4)
        assertEquals("Each person gets 1 slices with 0 slices leftover", pizzaParty.partyOn())
    }

    @Test
    fun test6People2Pizzas4Slices() {
        val pizzaParty = PizzaParty(6, 2, 4)
        assertEquals("Each person gets 1 slices with 2 slices leftover", pizzaParty.partyOn())
    }

    @Test
    fun test5People1Pizzas6Slices() {
        val pizzaParty = PizzaParty(5, 1, 6)
        assertEquals("Each person gets 1 slices with 1 slices leftover", pizzaParty.partyOn())
    }
}