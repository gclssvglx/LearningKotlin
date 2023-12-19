package com.gclewis.chapter.three

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SelfCheckoutTest {
    @Test
    fun test2Items11OfEach() {
        val checkout = Checkout()
        checkout.addItem(1.5, 1)
        checkout.addItem(3.5, 1)
        assertEquals("Subtotal [5.0] Tax [0.275] Total [5.275]", checkout.total())
    }

    @Test
    fun test3Items211OfEach() {
        val checkout = Checkout()
        checkout.addItem(25.0, 2)
        checkout.addItem(10.0, 1)
        checkout.addItem(4.0, 1)
        assertEquals("Subtotal [64.0] Tax [3.52] Total [67.52]", checkout.total())
    }
}