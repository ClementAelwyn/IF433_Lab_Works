package oop_00000105577_ClementAelwynWirawan.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] CCTV menyala, kamera aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("[$name] CCTV dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] Mulai merekam video ke Cloud storage...")
    }
}