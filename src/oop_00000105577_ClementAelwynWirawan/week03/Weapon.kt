package oop_00000105577_ClementAelwynWirawan.week03

class Weapon(val name: String, damage: Int) {
    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("WARNING: Damage ga boleh negatif! Nilai tidak diubah.")
            } else if (value > 1000) {
                println("WARNING: Damage terlalu besar! Dipaksa jadi 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            return if (damage > 800) {
                "Legendary"
            } else if (damage > 500) {
                "Epic"
            } else {
                "Common"
            }
        }
}