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

    val someObject: Any = 100 // Tipe aslinya Integer
    // Coba cast ke String. Jika gagal (null), ganti dengan "Unknown String"
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    //Output :
// === TEST SAFE CALLS & ELVIS ===


    //Tujuan pengiriman: Kota Tidak Diketahui

    //TEST LET BLOCK ===
            //Transaksi Valid. Harga: Rp250000, Pajak: Rp27500.0

    // TEST SAFE CASTING //
            //Ditemukan teks: LAPTOP
            //Hasil cast + fallback: Unknown String

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData: String? = null
    try {
        // DANGEROUS: Memaksa compiler percaya data ini tidak null
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        // Alih-alih apiResponse["token"]!!
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message) // Mencetak pesan custom kita, bukan crash buta
    }

    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    // Kita menekan tombol !! karena KITA TAHU implementasi Java-nya aman
    val statusLength = javaResponse!!.length
    println("Status dari Java: $javaResponse (Length: $statusLength)")

}