package kotlins//techjays

fun numberOfOccurences(){
    val arr= intArrayOf(5,6,7,8,2,4,3,5,2,4,5,6,7,4,3,5,6)
    var map= mutableMapOf<Int,Int>()

    for (i in arr){
        map[i] = map.getOrDefault(i,0)+1
    }
    for (i in arr) {
        if (map.contains(i))
        println("$i occurred: ${map[i]} times")
        map.remove(i)
    }
}

fun main(){
    numberOfOccurences()
    println("-------------------")
    numberOfOccurence()
}

fun numberOfOccurence() {
    var arr=intArrayOf(2,2,3,3,4,4,5,5,7)
    var occurence=mutableMapOf<Int,Int>()

    for(i in arr){
        if(occurence.containsKey(i)){
            occurence[i]=occurence[i]!!+1
        }else{
            occurence[i]=1
        }
    }
    println(occurence)
}

