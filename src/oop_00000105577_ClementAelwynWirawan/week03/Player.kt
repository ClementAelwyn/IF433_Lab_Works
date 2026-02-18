package oop_00000105577_ClementAelwynWirawan.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP yang ditambah harus positif!")
            return
        }

        val levelSebelum = level
        xp += amount
        println("$username dapat $amount XP! Total XP: $xp")

        if (level > levelSebelum) {
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}