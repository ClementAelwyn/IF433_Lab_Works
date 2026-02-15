package oop_00000105577_ClementAelwynWirawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val heroName: String
    val damage: Int
    var enemyHp: Int
    var choice: Int

    println("=== MINI RPG BATTLE ===")

    print("Masukkan nama hero kamu: ")
    heroName = scanner.nextLine()

    print("Masukkan base damage: ")
    damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    enemyHp = 100

    println("\nPertarungan dimulai! ${hero.name} vs Monster!")
    println("HP Hero: ${hero.hp} | HP Monster: $enemyHp\n")

    while (hero.isAlive() && enemyHp > 0) {
        println("Pilih aksi:")
        println("1. Serang")
        println("2. Kabur")
        print(">> ")
        choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Monster")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Monster tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Monster membalas! Damage: $enemyDamage")
                hero.takeDamage(enemyDamage)
                println("HP ${hero.name} tersisa: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        } else {
            println("Pilihan ga valid!")
        }
        println()
    }

    if (enemyHp <= 0) {
        println("${hero.name} MENANG! Monster dikalahkan!")
    } else if (!hero.isAlive()) {
        println("${hero.name} kalah... Game Over.")
    } else {
        println("${hero.name} kabur. Pertarungan selesai.")
    }
}