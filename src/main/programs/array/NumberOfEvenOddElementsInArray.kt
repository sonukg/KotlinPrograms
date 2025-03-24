package array

fun findNumberOfEvenAndOddElementsInArray(){
    var array = intArrayOf(2,2,3,3,5,6,7,8,9,10,11,12,13)
    var evenCount=0
    var oddCount=0
    for (i in array.indices){
        if (array[i] % 2 == 0){
            evenCount++
        }else{
            oddCount++
        }
    }
    println("EvenCount is : ${evenCount} and OddCount is : ${oddCount}")
}

fun finEvenAndOddOfElementInArray(){
    var array = intArrayOf(2,2,3,3,5,6,7,8,9,10,11,12,13)
    var evenCount=0
    var oddCount=0
    var i=0

    while (i<array.size){
        if (array[i] % 2==0){
            evenCount++
        }else{
            oddCount++
        }
        i++
    }

    println("EvenCount is : ${evenCount} and OddCount is : ${oddCount}")
}

fun main(){
    findNumberOfEvenAndOddElementsInArray()
    println("------------------------------")
    finEvenAndOddOfElementInArray()
}