// Smart Casting


fun checkType(input: Any?) {
    // input.length                                         // Compiler Error - because input is of type Any
    if (input is String?) {
        if (input == null) {
            println("Input was a null String")
        }
        else {
            println("Input is a String with length ${input.length}")              // Compiler does the smart casting for us
        }
    }
    if (input !is Int) {
        println("Input is not an Int")
    }

    when (input) {
        null -> println("Input was null")
        is String -> println("Input is a String with length ${input.length}")
    }
}

fun main() {

    val aGenericVariable: Any = 5
    // val anIntVariable: Int = aGenericVariable               // Compiler Error
    val anIntVariable: Int = aGenericVariable as Int

    // Casting to incompatible values
    val anotherGenericVariable: Any = "A String"
    // val anotherIntVariable: Int = aGenericVariable as Int              // Runtime Error

    checkType(aGenericVariable)                         // Nothing gets printed
    checkType(anotherGenericVariable)                   // Both prints are printed
    checkType((null))


}