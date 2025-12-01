package strings


fun swap(a: Int, b: Int): Pair<Int, Int> {
    var x = a
    var y = b
    x = x + y
    y = x - y
    x = x - y
    return Pair(x, y)
}

fun main() {
    val a = 5
    val b = 10
    val (swappedA, swappedB) = swap(a, b)
    println("swap value: a=$swappedA, b=$swappedB")
}


