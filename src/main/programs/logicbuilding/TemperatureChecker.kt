package logicbuilding

fun checkTemperature(temp: Int): String {
    return when {
        temp < 15 -> "Cold"
        temp in 15..24 -> "Warm"
        else -> "Hot"
    }
}

fun main() {

    val testTemps = listOf(10, 15, 20, 25, 30, 5, 35)
    
    for (temp in testTemps) {
        println("$temp°C is ${checkTemperature(temp)}")
    }
}
