package array

fun main(){
    var arr= intArrayOf(2,4,7,39,38,37)
    var tMax=thirdMaxElement(arr)
    println(tMax)
}

fun thirdMaxElement(arr: IntArray): Int {
    var max=arr[0]
    var sMax=arr[1]
    var tMax=arr[2]

    for (i in arr.indices){
        if (arr[i]>max) {
            tMax = sMax
            sMax = max
            max = arr[i]
        }else if (arr[i]>sMax && arr[i]>tMax && arr[i]<max){
            tMax=sMax
            sMax=arr[i]

        }else if (arr[i]>tMax && arr[i]<sMax && arr[i]<max){
            tMax=arr[i]
        }
    }
    return tMax
}
