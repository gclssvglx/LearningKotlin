package com.gclewis.chapter.three

class Checkout {
    private val items: MutableList<CheckoutItem> = ArrayList()
    private var taxRate: Double = 5.5

    fun addItem(price: Double, quantity: Int) {
        items.add(CheckoutItem(price, quantity))
    }

    fun total(): String {
        var subtotal: Double = 0.0
        items.forEach {
            subtotal += it.subtotal()
        }
        val tax = (taxRate / 100) * subtotal
        return "Subtotal [$subtotal] Tax [$tax] Total [${subtotal + tax}]"
    }
}
