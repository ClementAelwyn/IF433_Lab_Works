package oop_00000105577_ClementAelwynWirawan.week06


interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    fun click()
}
