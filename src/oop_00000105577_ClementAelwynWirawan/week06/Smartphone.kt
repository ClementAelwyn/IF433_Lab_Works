package oop_00000105577_ClementAelwynWirawan.week06

class Smartphone: Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika Camera
        super<Phone>.turnOn()  // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}