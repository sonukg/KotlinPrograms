package array

//finds the maximum number of consecutive zeros in the integer array and prints that count.
/*fun main() {
    val a=intArrayOf(1,0,1,0,1,0,1,0,0,0,0,0,1,0,1)
    var maxcount=0
    var current=0


    for(i in a ){

        if(i==0){
            current++
            if(current > maxcount){
                maxcount=current
            }
        }else{
            current=0
        }
    }

    print(maxcount)
}*/

fun maxConsecutiveZerosIterative(a: IntArray): Int {
    var max = 0
    var curr = 0
    for (v in a) {
        if (v == 0) {
            curr++
            if (curr > max) max = curr
        } else {
            curr = 0
        }
    }
    return max
}

tailrec fun maxConsecutiveZerosRecursive(a: IntArray, index: Int = 0, curr: Int = 0, max: Int = 0): Int {
    if (index >= a.size) return max
    val newCurr = if (a[index] == 0) curr + 1 else 0
    val newMax = if (newCurr > max) newCurr else max
    return maxConsecutiveZerosRecursive(a, index + 1, newCurr, newMax)
}

fun maxConsecutiveZerosFold(a: IntArray): Int {
    // Pair.first = current run, Pair.second = max run
    return a.fold(0 to 0) { (curr, max), v ->
        if (v == 0) (curr + 1) to maxOf(max, curr + 1) else 0 to max
    }.second
}

fun maxConsecutiveZerosByString(a: IntArray): Int {
    // join to "10100100..." then split on '1' to get runs of zeros
    val s = a.joinToString(separator = "") { it.toString() }
    return s.split('1').maxOfOrNull { it.length } ?: 0
}

fun main() {
    val a = intArrayOf(1,0,1,0,1,0,1,0,0,0,0,0,1,0,1)
    println(maxConsecutiveZerosIterative(a))       // imperative
    println(maxConsecutiveZerosRecursive(a))       // tail\-recursive
    println(maxConsecutiveZerosFold(a))            // functional fold
    println(maxConsecutiveZerosByString(a))        // string\-split / regex style
}


