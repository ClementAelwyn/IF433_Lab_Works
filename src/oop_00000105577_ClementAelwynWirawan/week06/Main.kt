package oop_00000105577_ClementAelwynWirawan.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    println("\n=== SMART HOME SYSTEM ===")
    val lamp = SmartLamp(id = "LAMP-01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SPK-01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "CCTV-01", name = "Ezviz Garasi")
}