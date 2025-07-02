package kotlin_fund_prog

//When we don't want to return inside lambda function (non-local returns) that is passed as inline argument,
// we use crossinline keyword on that lambda argument.


data class PersonOne(var name: String)
fun createPerson() {
    val person = PersonOne("Sonu")
    person.name = "Kumar"
    performFunction {
        println("Created a person with name: ${person.name}")
//        return  // Not allowed here as its crossinline
    }
}

inline fun performFunction (crossinline x : () -> Unit) {
    x()
}

fun main(){
    createPerson()

}