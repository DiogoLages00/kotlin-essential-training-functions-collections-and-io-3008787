// Challenge: Write a name formatter function


// write a function that satisfies the following requirements

// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function

fun printFormattedName(firstName: String, lastName: String, format: String, formatter: (String, String, String) -> String) {
    println("The formatted name is: ${formatter(firstName, lastName, format)}")
}

val formatter: (firstName: String, lastName: String, format: String) -> String = { firstName, lastName, format ->
    "$firstName$format$lastName"
}

val emailFormatter: (firstName: String, lastName: String, format: String) -> String = { firstName, lastName, format ->
    "$firstName$format$lastName@criticaltechworks.com"
}


fun main() {
    printFormattedName("Diogo", "Lages", ".", formatter)
    printFormattedName("Diogo", "Lages", "@", formatter)

    printFormattedName("Diogo", "Lages", ".", emailFormatter)
    printFormattedName("Harrison", "Ford", ".", emailFormatter)

    printFormattedName("Oliveira", "Pedro", "-") { first, last, format ->
        "$last $format $first"
    }
}