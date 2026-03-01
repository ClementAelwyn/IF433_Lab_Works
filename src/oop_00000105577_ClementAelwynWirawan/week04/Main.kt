package oop_00000105577_ClementAelwynWirawan.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(brand = "AION", numberOfDoors = 4, batteryCapacity = 100)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()


    println("\n--- Testing Manager ---")
    val manager = Manager(name = "Memen", baseSalary = 100000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer(name = "Clemong", baseSalary = 100000000, programmingLanguage = "Jawa")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}