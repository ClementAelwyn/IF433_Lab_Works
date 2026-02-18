package week3teori

open class Pelajar {
    private var nama = "belum ada nama"
    private var nilai: Int = 0
    protected var jmlsks: Int = 0  // ← tambahin ini


    fun set_jmlsks(sks: Int) {  // ← tambah ini
        if (sks < 0) {
            println("sks ga boleh minus")
        } else {
            this.jmlsks = sks
        }
    }

    fun set_nama(namaorang: String) {
        if (namaorang.length == 0) {  // ← fix: < 0 jadi == 0
            println("eh nama ga boleh kosong")
        } else {
            this.nama = namaorang
        }
    }

    fun set_nilai(nilai: Int) {
        if (nilai < 0) {
            println("nilai ga boleh mines")
        } else {
            this.nilai = nilai
        }
    }

    fun get_nama(): String {
        return this.nama
    }

    fun get_nilai(): Int {
        return this.nilai
    }

    class MataKuliah : Pelajar() {
        fun muncul_namasks(): Int {
            return this.jmlsks
        }
    }
}

fun main() {
    var mahasiswa = Pelajar.MataKuliah()  // ← ganti ini
    mahasiswa.set_nama("Udi")
    mahasiswa.set_nilai(4)
    mahasiswa.set_jmlsks(20)             // ← tambahin ini buat set sks
    println("Nama kamu: ${mahasiswa.get_nama()} dan kamu dapat nilai : ${mahasiswa.get_nilai()}")
    println("Sks kamu : ${mahasiswa.muncul_namasks()}")
}