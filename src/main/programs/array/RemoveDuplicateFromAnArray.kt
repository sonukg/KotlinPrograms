package array

fun removeDuplicateFromAnArray(){
    var array= intArrayOf(2,3,4,5,6,7,2,3,3,4,6,7)
    var uniqueArray= mutableSetOf<Int>()
    for (i in array.indices){
            if (!uniqueArray.contains(array[i])){
                uniqueArray.add(array[i])
            }
    }
    println(uniqueArray.toList())
    println("-----------------------------")
    //with while loop
    var j=0
    var uniqueArray1= mutableSetOf<Int>()
    while (j<array.size){
        if (!uniqueArray1.contains(array[j])){
            uniqueArray1.add(array[j])
        }
        j++
    }
    println(uniqueArray1)
}

fun removeDuplicateFromAnArrayWithHashMap(){
    var array= intArrayOf(2,3,4,5,6,7,2,3,3,4,6,7)
    var uniqueArray= mutableMapOf<Int,Boolean>()
    for (i in array.indices){
        if (!uniqueArray.contains(array[i])){
            uniqueArray.put(array[i],true)
        }
    }
    println(uniqueArray.toList())
}

fun removeDuplicateFromAnArrayWithArrayListOf(){
    var array= intArrayOf(2,3,4,5,6,7,2,3,3,4,6,7)
    var uniqueArray= mutableListOf<Int>()
    for (i in array.indices){
        if (!uniqueArray.contains(array[i])){
            uniqueArray.add(array[i])
        }
    }
    println(uniqueArray.toList())

}


fun main(){
    //removeDuplicateFromAnArray()
    //removeDuplicateFromAnArrayWithHashMap()
    removeDuplicateFromAnArrayWithArrayListOf()
}