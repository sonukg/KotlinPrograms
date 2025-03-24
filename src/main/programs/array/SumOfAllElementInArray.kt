package array

fun sumOfAllElementInArray() {
    var array= intArrayOf(1,2,3,4,5)
    var sum=0

    for (i in array.indices){
        sum =sum+array[i]
    }
    println(sum)
}

fun sumOfAllElementInArrayOne(){
    var array= intArrayOf(1,2,3,4,5)
    var sum=0
    var i=0

    while (i<array.size){
        sum +=array[i]
        i++
    }
    println(sum)

}

fun main(){
    sumOfAllElementInArray()
    println("----------------------------")
    sumOfAllElementInArrayOne()
}