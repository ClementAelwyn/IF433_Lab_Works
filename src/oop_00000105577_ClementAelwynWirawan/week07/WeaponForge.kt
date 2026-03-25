package oop_00000105577_ClementAelwynWirawan.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            println("Menempa Starter Sword...")
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Pedang Api Legendaris", 80, ItemRarity.EPIC)
            println("Menempa Epic Sword...")
            return Weapon(item, 200)
        }
    }

    override fun toString(): String {
        return "Weapon(item=$item, durability=$durability)"
    }
}
