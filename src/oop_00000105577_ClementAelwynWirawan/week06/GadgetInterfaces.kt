package oop_00000105577_ClementAelwynWirawan.week06

class GadgetInterfaces {
    interface Camera {
        fun turnOn() { println("Lensa kamera terbuka dan sensor aktif.") }
    }

    interface Phone {
        fun turnOn() { println("Sinyal seluler mencari jaringan.") }
    }
}