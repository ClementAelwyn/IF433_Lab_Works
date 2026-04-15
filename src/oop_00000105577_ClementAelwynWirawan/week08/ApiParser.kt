package oop_00000105577_ClementAelwynWirawan.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name. Gunakan requireNotNull dengan pesan error custom.
        // Jika tidak ada, fungsi ini akan throw IllegalArgumentException
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        // Ekstrak type sebagai String
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Ekstrak warranty dengan fallback Elvis jika null atau tipe salah
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Ekstrak size dengan fallback Elvis jika null atau tipe salah
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            // Jika tipenya selain itu (atau null), return null
            else -> null
        }
    }

    fun checkout(product: Product) {
        // Ekstrak ID dari product dengan pola when (karena ia sealed class)
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Wajib: gunakan !! karena kita yakin Java service selalu berhasil
        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Payment sukses! Transaction ID: $transactionId")
    }
}