package logicbuilding
//Take a number and print whether it’s positive, negative, or zero.

    fun number(number: Int){
        if (number>0){
            println("Positive")
        }else if (number<0){
            println("Negative")
        }else{
            println("Zero")
        }

    }
    fun main(){

        var number=10
        var number2=-10
        number(number)
        number(number2)
    }
