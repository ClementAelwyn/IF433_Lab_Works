package oop_00000105577_ClementAelwynWirawan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}