package array

fun secondMaxElement(arr:IntArray):Int {
    var max=arr[0]
    var sMax=arr[1]

    for (i in arr.indices){
        if (arr[i] >max){
            sMax=max
            max=arr[i]
        }else if (arr[i]>sMax && arr[i]<max){
            sMax=arr[i]
        }
    }
    return sMax
}

fun main(){
    var arr= intArrayOf(2,3,9,8,30,39)
    var sMax= secondMaxElement(arr)
    println(sMax)
}