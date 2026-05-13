package oop_00000105577_ClementAelwynWirawan.week12


fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}