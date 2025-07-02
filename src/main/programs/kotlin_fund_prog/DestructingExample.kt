package kotlin_fund_prog

data class DestructingExample(val name: String, val age: Int)


fun main() {
    val (name, age) = DestructingExample("John", 30)
    println("Name: $name, Age: $age")
}
