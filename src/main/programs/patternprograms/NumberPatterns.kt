package patternprograms

fun pattern1(){
    var num=5
    for (i in 1..num){
        for (j in 1..num){
            print(" * ")
        }
        println()
    }
}
fun pattern2(){
    var num=5
    for (i in 1..num){
        for (j in 1..num){
            print(" "+i)
        }
        println()
    }
}

fun pattern3(){
    var num=5
    for (i in 1..num){
        for (j in 1..num){
            print(" "+j)
        }
        println()
    }
}
fun pattern4(){
    var num=5
    for (i in num downTo 1 ){
        for (j in num downTo 1){
            print(" "+i)
        }
        println()
    }
}

fun pattern5(){
    var num=5
    for (i in num downTo 1 ){
        for (j in num downTo 1){
            print(" "+j)
        }
        println()
    }
}

fun pattern6(){
    var num=5
    var k=1
    for (i in 1..num ){
        for (j in 1..num){
            print(" "+k)
            k++
        }
        println()
    }
}
fun pattern7(){
    var num=5
    var k=1
    for (i in 1..num ){
        for (j in 1..num){
            print(" "+k)
            k+=2
        }
        println()
    }
}
fun pattern8(){
    var num=5
    var k=2
    for (i in 1..num ){
        for (j in 1..num){
            print(" "+k)
            k+=2
        }
        println()
    }
}
fun pattern9(){
    var num=5
    for (i in 1..num ){
        for (j in 1..num){
            print(" "+i*j)
        }
        println()
    }
}
fun pattern10(){
    var num=5
    for (i in 1..num ){
        for (j in 1..num){
            print(" "+j+" "+i+" ")
        }
        println()
    }
}

fun pattern11(){
    var num=5
    for (i in 1..num ){
        for (j in 1..num){
            print(" "+i+" "+j+" ")
        }
        println()
    }
}

fun pattern12(){
    var num=5
    var k=0
    for (i in 1..num ){
        k=i
        for (j in 1..num){
            print(""+k)
            k+=num
        }
        println()
    }
}

fun pattern13(){
    var num=5
    var k=0
    var m=0
    for (i in 1..num ){
        k=i
        m=num-i+1
        for (j in 1..num){
            if (j%2==1){
                print(" "+k)
            }else{
                print(" "+m)
            }

            k=k+num
            m=m+num
        }
        println()
    }
}

fun pattern14(){
    var num=5
    var k=0
    for (i in 1..num ){
        k=num-i+1
        for (j in 1..num){
            print(" "+k)
            k=k+num
        }
        println()
    }
}

fun pattern15(){
    var num=5
    var k=0
    var m=0
    for (i in 1..num ){
        k=i
        m=num-i+1
        for (j in 1..num){
            if (j % 2==0){
                print(" "+k)
            }else{
                print(" "+m)
            }

            k=k+num
            m=m+num
        }
        println()
    }
}

fun main(){
    pattern1()
    println("--------------------")
    pattern2()
    println("--------------------")
    pattern3()
    println("--------------------")
    pattern4()
    println("--------------------")
    pattern5()
    println("--------------------")
    pattern6()
    println("--------------------")
    pattern7()
    println("--------------------")
    pattern8()
    println("--------------------")
    pattern9()
    println("--------------------")
    pattern10()
    println("--------------------")
    pattern11()
    println("--------------------")
    pattern12()
    println("--------------------")
    pattern13()
    println("--------------------")
    pattern14()
    println("--------------------")
    pattern15()
}
