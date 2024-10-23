// Basic functions

fun printGreeting() {
    println("Hello World")
}

public fun getGreeting(): String {
    return "Hello Kotlin"
}

private fun printGreeting2() = println("Hello World 2")    // Single expression function

// fun getGreetingError() = println(getGreeting2())    // Cannot reach getGreeting2 (local)

fun main(): Unit {        // Unit - non-meaningful return type
    fun getGreeting2() = "Hello Kotlin 2"    // Single expression function

    printGreeting()
    println(getGreeting())

    printGreeting2()
    println(getGreeting2())   // only main can call this function (getGreeting2())
}