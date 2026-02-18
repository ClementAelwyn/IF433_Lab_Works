package oop_00000105577_ClementAelwynWirawan.week03

class Employee (val name:String) {
    var salary: Int=0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0 // Gunakan field, bukan this.salary
            } else {
                field = value // Gunakan field untuk assign nilai asli
            }
        }
    // Hanya bisa diakses di file/class ini saja
    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    // Kita tidak buat getter untuk performanceRating, jadi data ini bener-bener rahasia
    // Kecuali kita buat function khusus untuk print
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}