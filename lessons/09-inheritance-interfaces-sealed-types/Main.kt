sealed interface Result

data class Success(val value: String) : Result
data class Failure(val message: String) : Result

fun describe(result: Result): String = when (result) {
    is Success -> "Success: ${result.value}"
    is Failure -> "Failure: ${result.message}"
}

fun main() = println(describe(Success("Ready")))