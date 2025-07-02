package kotlin_fund_prog

//A sealed class is a class that restricts the class hierarchy. It allows you to define
// a closed set of subclasses within the same file.

//Sealed classes are useful for representing restricted hierarchies, such as states or types,
// where all possible subclasses are known at compile time.


sealed class SealedClassResult{
    data class Success(var data:String):SealedClassResult()
    data class Error(var error:String):SealedClassResult()
    object Loading:SealedClassResult()
}


fun HandlerResult(result: SealedClassResult){
    when(result){
        is SealedClassResult.Success -> {
            println(result.data)
        }
        is SealedClassResult.Error -> {
            println(result.error)
        }
        SealedClassResult.Loading -> {
            println("Loading")
        }
    }
    }

fun main(){
    HandlerResult(SealedClassResult.Success("Success"))
    HandlerResult(SealedClassResult.Error("Error"))
    HandlerResult(SealedClassResult.Loading)
}


//another way of declare the sealed class
sealed class Result<out T: Any>{
    data class Success<out T: Any>(val data: T): Result<T>()
    data class Error(val exception: Exception): Result<Nothing>()
    object Loading: Result<Nothing>()
}