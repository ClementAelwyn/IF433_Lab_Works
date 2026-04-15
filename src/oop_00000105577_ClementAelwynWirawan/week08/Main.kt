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
}