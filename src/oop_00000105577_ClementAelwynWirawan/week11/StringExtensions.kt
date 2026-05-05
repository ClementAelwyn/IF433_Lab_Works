package oop_00000105577_ClementAelwynWirawan.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    // 'this' bisa bernilai null, jadi harus ditangani
    return this == null || this.isEmpty()
}