package oop_00000105577_ClementAelwynWirawan.week01

fun calculateDiscount(price: Int) = if (price > 500000) price * 80 / 100 else price * 90 / 100

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000

    val finalPrice = calculateDiscount(price)
}