package array

fun findElementsOfArrayInAlternatePosition(){
    var array = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13)
    var oddElementArray= mutableListOf<Int>()
    for (i in array.indices){
        if (array[i] %2!=0){
           oddElementArray.add(array[i])
        }
    }
    println(oddElementArray)
}

fun findElementsOfArrayInAlternatePositionWhile(){
    var array = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13)
    var i=0
    var oddElementArray= mutableListOf<Int>()
    while (i <array.size){
        if (array[i] %2!=0){
            oddElementArray.add(array[i])
        }
        i++
    }
    println(oddElementArray)
}

fun main(){
    findElementsOfArrayInAlternatePosition()
    println("------------------------------")
    findElementsOfArrayInAlternatePositionWhile()
}