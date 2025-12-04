package logicbuilding

import java.util.Scanner

fun canDivideIntoNotes(amount: Int): String {
    if (amount < 0) {
        return "Please enter a non-negative amount."
    }
    
    // Maximum possible 2000 notes
    val max2000 = amount / 2000
    
    for (count2000 in max2000 downTo 0) {
        val remainingAfter2000 = amount - (count2000 * 2000)
        
        // For each possible count of 500 notes
        val max500 = remainingAfter2000 / 500
        
        for (count500 in max500 downTo 0) {
            val remainingAfter500 = remainingAfter2000 - (count500 * 500)
            
            // Check if remaining amount can be divided by 100
            if (remainingAfter500 >= 0 && remainingAfter500 % 100 == 0) {
                val count100 = remainingAfter500 / 100
                return "Yes, possible with:\n" +
                       "• 2000 notes: $count2000\n" +
                       "• 500 notes: $count500\n" +
                       "• 100 notes: $count100"
            }
        }
    }
    
    return "No, the amount cannot be divided into 2000, 500, and 100 notes."
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter an amount: ")
    
    if (!scanner.hasNextInt()) {
        println("Please enter a valid integer amount.")
        return
    }
    
    val amount = scanner.nextInt()
    println(canDivideIntoNotes(amount))
}
