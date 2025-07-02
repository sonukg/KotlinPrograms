package kotlin_fund_prog

//What are noinline keyword? Where we need to use them in realtime scenario?
//
//A) We cannot pass a lambda function, which comes as argument inside inline function,
// to another function that accepts lambda. We will get an error stating 'Illegal usage of inline-parameter'.
// In this case we need to pass that lambda function with noinline keyword which makes the compiler instead
// of writing the code to the called location, creates the function for that specific function.

//We'll use this only in case if multiple lambdas are passed to function arguments.
// If there is only one lambda which need to be referenced in another function, we better not use inline function at all.

//Example 1: Passing a lambda to another function

inline fun process(
    action: () -> Unit,
    noinline callback: () -> Unit
) {
    action()
    runCallback(callback)
}

fun runCallback(cb: () -> Unit) {
    cb()
}

fun main() {
    process(
        { println("Action executed") },
        { println("Callback executed") }
    )

    doWork(
        { println("Task running") },
        { println("Task complete") }
    )
}


//Example 2: Storing a lambda in a variable
inline fun doWork(
    task: () -> Unit,
    noinline onComplete: () -> Unit
) {
    task()
    val completion = onComplete
    completion()
}

