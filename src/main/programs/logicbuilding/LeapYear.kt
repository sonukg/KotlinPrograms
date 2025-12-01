package logicbuilding

fun main() {
    var year=2024
    if(year%4==0)
        println("Leap Year")
    else if (year%100==0)
        println("Not a Leap Year")
    else if (year%400==0)
        println("Leap Year")
    else
        println("Not a Leap Year")
}