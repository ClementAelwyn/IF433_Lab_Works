package oop_00000105577_ClementAelwynWirawan.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN ERROR karena tipe referensinya adalah Pegawai

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }

    println("\n=== TUGAS MANDIRI 1: MathHelper Overloading ===")

    val math = MathHelper()
    println("Luas persegi (sisi=5): ${math.hitungLuas(5)}")
    println("Luas persegi panjang (p=8, l=4): ${math.hitungLuas(8, 4)}")
    println("Luas lingkaran (r=7.0): ${math.hitungLuas(7.0)}")


    println("\n=== TUGAS MANDIRI 2: Payment Polymorphism ===")

    val ewallet = EWallet(accountName = "GoPay Clement", balance = 50000.0)
    val creditCard = CreditCard(accountName = "BCA Card Clement", limit = 100000.0)
    val metodePembayaran: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (metode in metodePembayaran) {
        metode.processPayment(75000.0)
    }
}