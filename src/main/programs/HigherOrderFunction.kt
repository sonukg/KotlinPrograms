fun main() {
var result1=add(2,4)
    print(result1)

    var result2=add2(2,b=5 ){c,d ->
       c.plus(d)
    }
    print(result2)

    var result3=add3(2,4)
    print(result3.invoke(5,7))
}

fun add(a: Int,b: Int):Int{
    return a.plus(b)
}

fun add2(a: Int,b: Int,c:(Int,Int)->Int):Int{
    return c.invoke(a,b)
}


fun add3(a: Int,b: Int):(Int,Int)->Int{
    return {c,d->
        c.plus(d)
    }
}