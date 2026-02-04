package oop_00000105577_ClementAelwynWirawan.week01

fun calculateDiscount(price: Int) = if (price > 500000) price * 80 / 100 else price * 90 / 100

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String) {
    println("===== STRUK STEAMKW =====")
    println("Game: $title")
    println("Harga Asli: Rp$originalPrice")
    println("Harga Akhir: Rp$finalPrice")
    println("Catatan: $note")
    println("=========================")
}

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    val noteText = userNote ?: "Tidak ada catatan"

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice, note = noteText)
}