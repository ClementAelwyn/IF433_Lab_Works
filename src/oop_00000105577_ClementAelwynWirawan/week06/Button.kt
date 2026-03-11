package oop_00000105577_ClementAelwynWirawan.week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}