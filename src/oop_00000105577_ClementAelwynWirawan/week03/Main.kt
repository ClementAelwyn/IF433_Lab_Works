package oop_00000105577_ClementAelwynWirawan.week03

fun main() {
    val e = Employee("Budi")
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    e.printStatus()
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== Test Weapon ===")
    val sword = Weapon("Excalibur", 500)
    println("Weapon: ${sword.name}, Damage: ${sword.damage}, Tier: ${sword.tier}")

    sword.damage = -50
    println("Damage setelah set -50: ${sword.damage}")

    sword.damage = 9999
    println("Damage setelah set 9999: ${sword.damage}")
    println("Tier sekarang: ${sword.tier}")
}