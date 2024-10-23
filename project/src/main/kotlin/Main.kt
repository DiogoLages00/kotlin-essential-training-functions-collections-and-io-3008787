// try/catch as control flow


fun main() {
    // val message = "The value is ${10/0}"      // Error - throws arithmetic exception

    try {
        val message = "The value is ${10/0}"
    }
    catch (error: Throwable) {      // Issue - handling the error this way branches the normal execution of the code
        println("Error was thrown")
    }

    // This way we reduce the conditional branching in the code
    val message = try {                                 // We can be sure that message always has a value
        // throw IllegalStateException()
        val message = "The value is ${10/0}"
    }
    catch (error: ArithmeticException) {
        "Arithmetic Error was thrown"
    }
    catch (error: Throwable) {              // We are catching any throwable, also catches the IllegalStateException thrown
        "Error was thrown"
    }
    println(message)
}