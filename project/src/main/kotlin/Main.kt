// Function parameters

private fun printGreeting() = println("Hello Kotlin")

fun main() {

    fun getGreeting(thingToGreet: String) = "Hello $thingToGreet"
    fun getGreeting2(greeting: String, thingToGreet: String) = "$greeting $thingToGreet"
    fun getGreetingDefaultThing(greeting: String, thingToGreet: String = "World") = "$greeting $thingToGreet"

    fun getGreetingTotalDefault(
        greeting: String = "Hello",
        thingToGreet: String = "World"
    ) = "$greeting $thingToGreet"

    println(getGreeting("Kotlin Yeah"))
    println(getGreeting2("Heyah", "Kotlin!"))

    println(getGreetingDefaultThing("Heyah"))
    println(getGreetingDefaultThing("Heyah", "Kotlin World"))
    println(getGreetingTotalDefault())
    println(getGreetingTotalDefault("Hey"))

    println(getGreetingTotalDefault(thingToGreet = "World of Kotlin"))
    println(getGreetingTotalDefault(thingToGreet = "World of Kotlin", greeting = "Hey There"))     // change order of parameters

}