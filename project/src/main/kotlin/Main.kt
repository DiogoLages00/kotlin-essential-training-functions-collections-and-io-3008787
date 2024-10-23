// if and when statements

fun main() {

    if (true) println("The condition was true!")

    if (true) {
        val message = "Complex logic here!"
        println(message)
    }

    var someVariable = 5

    if (someVariable > 3) {
        println("The value was greater than 3")
    }
    else if (someVariable > 2) {
        println("The value was greater than 3")
    }
    else {
        println ("Not greater")
    }

    when {                          // Switch statements - same as if, else if and else statements
        someVariable > 3 -> println("The value was greater than 3")
        someVariable > 2 -> println("The value was greater than 2")
        else -> {
            println ("Not greater")
        }
    }

    when (someVariable) {
        0,1 -> println("Is 0 or 1!")
        2 -> println("Is 2!")
        3 -> println("Is 3!")
        in 4..Int.MAX_VALUE -> println("Is between 5 and MAX_INTEGER!")                     // can define ranges
        5 -> println("Is 5!")                                                                   // unreachable
    }


}