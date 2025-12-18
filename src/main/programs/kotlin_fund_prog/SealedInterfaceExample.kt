package kotlin_fund_prog
//Introduced in Kotlin 1.5, a sealed interface is similar to a sealed class but represents a
// restricted set of implementations of an interface.

//It is useful when you want to define a closed set of implementations for an interface.
sealed interface Vehicle {
    val name:String
    val model:String
    val year:Int
}

data class Car(override val name:String, override val model:String, override val year:Int):Vehicle
data class Bike(override val name:String, override val model:String, override val year:Int, val color:String):Vehicle

fun describevehicle(vehicle:Vehicle){
    when(vehicle){
        is Car -> {
            println("kotlin_fund_prog.Car name is ${vehicle.name} and model is ${vehicle.model} and year is ${vehicle.year}")
        }
        is Bike -> {
            println("kotlin_fund_prog.Bike name is ${vehicle.name} and model is ${vehicle.model} and year is ${vehicle.year} and color is ${vehicle.color}")
        }

        else -> {}
    }
    }

fun main(){
    describevehicle(Car("BMW","X5",2020))
    describevehicle(Bike("Hero","Splender Plus",2022,"Black"))
}


