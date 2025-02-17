

fun main(){
scopeLet()
    scopeRun()
    scopeWith()
    scopeApply()
    scopeAlso()
}

fun scopeLet() {
    val name:String?="Sonu Kumar"
    val nameLength=name?.let {
        println(it)
        it.length
    }
    println("Length of name: $nameLength")
}

fun scopeRun(){
    val name="Sonu Kumar"
    val nameLength=name.run {
        println(this)
        this.length
    }
    println("Length of name: $nameLength")
}

fun scopeWith(){
    val arr= mutableListOf(2,3,4,5,6,7)
    val sum= with(arr) {
        println("List:$this")
        this.sum()
    }
    println("sum of arr: $sum")
}

fun scopeApply(){
    var name= mutableListOf("Sonu","Kumar")
    val nameLength=name.apply {
        println(this)
        this.add("Singh")
    }
    println("name: $nameLength")

    //or

    val person = Person("Sonu", 23, "Banglore", "India")
    person.apply {
        age = 25
        city = "Chennai"
        country = "India"
    }

    println(person)
    println(person.name)
}

fun scopeAlso(){
    val name= mutableListOf("Sonu","Kumar")
    val nameLength=name.also {
        println(it)
        it.add("Singh")
    }
    println("name: $nameLength")

    //or

    val numbers = mutableListOf(1, 2, 3)

    numbers.also {
        println("Original list: $it")
        it.add(4) // Modifies the list
    }.let {
        println("Updated list: $it")
    }
}


data class Person(var name:String,var age:Int,var city:String,var country:String)