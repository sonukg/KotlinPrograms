package kotlin_fund_prog

open class Person{}

interface Person1{
    fun eat()
    fun sleep()
}
data class DataClassExample(val name: String, val age: Int) : Person(), Person1 {
    override fun eat() {
        println("eat")
    }

    override fun sleep() {
        println("sleep")
    }

}

fun main(){
    val person = DataClassExample("John", 30)
    println("Name: ${person.name}, Age: ${person.age}")

    val person2 = DataClassExample("John", 30)
    println("Are persons equal: ${person == person2}") // true
    println("Are persons equal: ${person === person2}")

    val person3 = person.copy(age = 31)
    println("Copied person: Name: ${person3.name}, Age: ${person3.age}")

    val (name, age) = person
    println("Destructured person: Name: $name, Age: $age")

    person.eat()
    person.sleep()
}


// how data class inherit the interface
