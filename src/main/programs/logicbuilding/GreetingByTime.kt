package logicbuilding

import java.time.LocalDateTime

fun main() {

    val currentHour = LocalDateTime.now().hour

    val greeting = when (currentHour) {
        in 5..11 -> "Good Morning"
        in 12..16 -> "Good Afternoon"
        in 17..20 -> "Good Evening"
        else -> "Good Night"
    }
    
    println("$greeting! The current time is ${LocalDateTime.now().hour}:${LocalDateTime.now().minute}")
}
