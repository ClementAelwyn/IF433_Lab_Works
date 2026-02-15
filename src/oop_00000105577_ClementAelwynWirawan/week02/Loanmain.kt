package oop_00000105577_ClementAelwynWirawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val title: String
    val borrower: String
    var duration: Int

    println("=== Sistem Peminjaman Buku ===")

    print("Input judul bukunya: ")
    title = scanner.nextLine()

    print("Masukkan namamu: ")
    borrower = scanner.nextLine()

    print("Masukkan lama pinjam (hari): ")
    duration = scanner.nextInt()

    if (duration < 0) {
        println("Lama pinjam ga boleh minus! Otomatis jadi 1 hari ya.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Lama Pinjam  : ${loan.loanDuration} hari")
    println("Total Denda  : Rp ${loan.calculateFine()}")
}