package com.gclewis.chapter.three

data class CheckoutItem(val price: Double, val quantity: Int) {
    fun subtotal(): Double {
        return price * quantity
    }
}