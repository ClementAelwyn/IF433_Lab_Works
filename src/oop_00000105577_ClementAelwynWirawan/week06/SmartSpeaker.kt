package oop_00000105577_ClementAelwynWirawan.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Speaker aktif dan siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("[$name] Speaker dimatikan.")
    }

    // Fungsi spesifik SmartSpeaker
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}