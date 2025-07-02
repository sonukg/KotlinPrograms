package kotlin_fund_prog

//Functions that take lambda parameter as arguments generates objects inside calling function's code.
// If these functions are called at multiple places, multiple objects are created which affects the performance of our Android App.
// To avoid these memory allocations created by lambda expressions (anonymous objects are created),
// we make the functions inline by adding a keyword - 'inline' to our function.

//Inline functions are generally used when we need to pass small functions as parameters.
// It is generally not advisable to pass large functions to inline functions.

inline fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val sum = performOperation(5, 3) { x, y -> x + y }
    println("Sum: $sum")

    val product = performOperation(5, 3) { x, y -> x * y }
    println("Product: $product")
}
