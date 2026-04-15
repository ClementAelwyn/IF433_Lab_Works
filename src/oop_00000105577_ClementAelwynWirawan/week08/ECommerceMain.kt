package oop_00000105577_ClementAelwynWirawan.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            // parseProduct bisa throw IllegalArgumentException jika ID/Name hilang
            val product = parser.parseProduct(raw)

            // Gunakan ?.let agar checkout hanya dipanggil jika product tidak null
            product?.let {
                parser.checkout(it)
            } ?: println("LOG: Produk di-skip karena tipe tidak dikenali.")

        } catch (e: IllegalArgumentException) {
            // Tangkap data korup yang missing ID/Name
            println("LOG WARNING: Data korup diabaikan. Alasan: ${e.message}")
        }
    }

    //Payment sukses! Transaction ID: TRX-E01-SUCCESS
    //Payment sukses! Transaction ID: TRX-C01-SUCCESS
   // Payment sukses! Transaction ID: TRX-E02-SUCCESS
   // LOG WARNING: Data korup diabaikan. Alasan: API Invalid: Missing ID
   // LOG: Produk di-skip karena tipe tidak dikenali.

}