// Statements vs Expressions
// Statement doesn't return any value
// Expression modifies or returns value


fun getMessage(input: Int) = if (input > 3) {
        "The value was greater than 3"
    }
    else {
        "The value was not greater than 3"
    }

fun getMessageWithWhen(input: Int) = when (input) {
    3 -> "The value is 3"
    else -> "The value is not 3"
}



fun main() {
    var someVariable = 5

    var message = if (someVariable > 3) {
        "The value was greater than 3"
    }
    else {
        "The value was not greater than 3"
    }
    println(message)
    println(getMessage(someVariable))

    message = when(someVariable) {
        3 -> "The value is 3"
        else -> "The value is not 3"
    }
    println(message)
    println(getMessageWithWhen(someVariable))

}