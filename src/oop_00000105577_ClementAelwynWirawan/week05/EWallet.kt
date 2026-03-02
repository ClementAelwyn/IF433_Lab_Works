package oop_00000105577_ClementAelwynWirawan.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran Rp$amount berhasil via E-Wallet. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Egiluy saldonya tidak cukup. Saldo: Rp$balance, Dibutuhkan: Rp$amount")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top-up Rp$amount berhasil. Saldo sekarang: Rp$balance")
    }
}