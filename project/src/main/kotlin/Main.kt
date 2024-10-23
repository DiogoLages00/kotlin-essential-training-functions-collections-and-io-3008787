// Functional types

var greetingFunction: () -> Unit = {            // represents a function that takes no parameters and returns Unit
    println("Hello Kotlin")
}

var greetingFunction2: (String) -> String = { thingToGreet ->
    "Hello $thingToGreet"
}


fun main() {

    greetingFunction()     // Normal call
    greetingFunction.invoke()     // equivalent to normal call
    greetingFunction = {                // Reassign function body
        println("Hello World!")
    }
    greetingFunction()

    println(greetingFunction2("Kotlin World"))
    greetingFunction2 = {                // Reassign function body
        "Hello World!"
    }
    println(greetingFunction2("there"))         // the value is never reassigned
    greetingFunction2 = {                // Reassign function body so the value is reassigned
        "Hello $it!"
    }
    println(greetingFunction2("there"))

}