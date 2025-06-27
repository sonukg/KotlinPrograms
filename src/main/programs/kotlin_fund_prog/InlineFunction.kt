package kotlin_fund_prog

//1.
inline fun inlineFunction(body:() -> String) {
        println("can u understand me ${body()}")
    }

    fun main() {
        inlineFunction(
            body = "This is an inline function call."::toString
        )
    }

//2.
private inline fun inlineFun(body: () -> String) {
    println("inline func code, " + body.invoke())
}

fun testInline() {
    inlineFun { "external inline code" }
}
private fun regularFun(body: () -> Any?) {
    println("regular func code, " + body.invoke())
}
fun testRegular() {
    regularFun { "external regular code" }
}

// In the case of an inline function, the calling code and the // inline function code are combined and inserted directly into // the call location, which eliminates the need to create an
// anonymous class for the passed lambda.
fun testInline1() {
    val var4 = (StringBuilder())
        .append("inline func code, ")
        .append("external inline code")
        .toString()
    println(var4)
}

fun testRegular1() {
    val body = ({ "external regular code" }) as Function0<*>
    regularFun(body)
}

// Output: This is an inline function call.
//can u understand me this is an inline function call.
// An inline function is a function that is expanded in place at the call site,
// rather than being called through the usual function call mechanism.
// This can improve performance by avoiding the overhead of a function call, especially for small functions that are called frequently.
