package array


fun main() {
    pairSum()
}

fun pairSum(){
    var arr =listOf(1,2,3,4,5,6,7,8,9)
    var target = 10
    for (i in arr){
        for (j in arr){
            if (i+j==target){
                println("$i $j")
            }
        }
    }
}