package oop_00000105577_ClementAelwynWirawan.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan
    // Jika ada satu saja bagian yang null di tengah rantai,
    // eksekusi akan berhenti dan mengembalikan null,
    // yang kemudian ditangkap oleh Elvis operator
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    // Idiom .let memastikan blok kode (dan variabel pembantunya)
    // hanya dieksekusi jika objek aslinya tidak null
    val receipt = validOrder.totalPrice?.let { price ->
        // Blok ini HANYA jalan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        // Hanya cetak jika cast sukses (text tidak null)
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
}