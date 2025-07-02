package kotlin_fund_prog

import Person

/*
A) There are 5 different scoping functions in Kotlin - let, apply, also, with, run.
Basically they are used to execute a block of code within the context of an object.

Scope Functions Table:

1. Let: let is an extension function that takes lambda block as parameter,
has 'it' as object reference inside the block and returns the lambda block's result as return type.*/

data class Persona(var name: String, var age: Int)

fun main() {
    val person = Persona("Sonu Kumar", 32)

    //let Example
    val names = person?.let {
        it.name
        it.age = 29
        "${it.name + " Gupta"} ${it.age}"
    }
    println(names)


    //with: with takes the context object and the code block (lambda) as the arguments,
    // has 'this' as object reference inside the block and performs the lambda functions operation
    // on the context passed. Returns the lambda result as return value.

    val person1 = Persona("Sonu", 29)
    val myName = with(person1) {
        this.name = "Sonu Kumar Gupta"
        this.age = 29
        "${this.name} ${this.age}"
    }
    println(myName)


    //apply: apply is an extension function that takes the code block (lambda) as an argument,
    // has 'this' as object reference inside the block and performs the lambda function on the context.
    // Returns context object as the return value.

    val person2 = Persona("Sonu", 29)
    val myName1 = person2.apply {
        this.name = "Raj Gupta"
    }
    println(myName1.name + " "+myName1.age)

    //also: also is an extension function that takes the code block (lambda) as an argument
    //has 'it' as object reference inside the block and performs the lambda function on the context.
    // Returns context object as the return value.

    val myName2 = person.also {
        it.name = "Sonu kumar" +" Gupta"
        it.age = 29 + 2
    }
    println(myName2.name + " "+myName2.age)

    //run: run is an extension function that takes the code block (lambda) as an argument,
    // has 'this' as object reference inside the block and performs the lambda function on the context.
    // Returns the lambda result as return value.
    val myper= Persona("skg",28)
    val myPersona=myper.run {
        this.name
        this.age
        "${this.name} ${this.age}"
    }
    println(myPersona)
}