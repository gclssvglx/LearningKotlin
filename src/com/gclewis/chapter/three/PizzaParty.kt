package com.gclewis.chapter.three

class PizzaParty(private val people: Int, private val pizzas: Int, private val slices: Int) {
    fun partyOn(): String {
        val totalSlices = pizzas * slices
        val slicesPerPerson = totalSlices / people
        val leftoverSlices = totalSlices % people
        return "Each person gets $slicesPerPerson slices with $leftoverSlices slices leftover"
    }
}