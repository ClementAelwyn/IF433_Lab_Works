package oop_00000105577_ClementAelwynWirawan.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Rp$amount berhasil via Credit Card. Terpakai: Rp$usedAmount / Rp$limit")
        } else {
            println("[$accountName] Transaksi anda ditolak! Melebihi limit. Terpakai: Rp$usedAmount, Limit: Rp$limit")
        }
    }
}