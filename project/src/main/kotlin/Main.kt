// Arrays


fun greetThings(greeting: String, items: Array<Any>) {
    for (item in items) {
        println("$greeting $item")
    }
}

fun greetThings2(greeting: String, vararg items: Any) {             // vararg parameters are treated as arrays by the compiler
    for (item in items) {
        println("$greeting $item")
    }
}


fun main() {
    val ints = arrayOf(1, 2, 3, 4, 5)           // Array of non-null ints - Int
    val ints2 = arrayOf(1, 2, 3, 4, null)           // Array of possibly null ints - Int?

    val nulls = arrayOfNulls<Int>(5)            // array of possible null ints of size 5 with null values

    val custom = Array(5) { index -> index  }       // Array (0, 1, 2, 3, 4) defined with lambda
    for (i in 0 until 5) {
        println(custom[i])
    }

    val size = ints.size
    println(size)

    var firstValue = ints.get(0)
    ints.set(0, 5)

    firstValue = ints[0]            // Kotlin offers index syntax for get in arrays
    ints[0] = 99                    // Kotlin offers index syntax for set in arrays

    val primitiveInts = intArrayOf(1, 2, 3, 4, 5)
    val primitiveUShorts = ushortArrayOf(1u, 2u, 3u, 4u, 5u)

    for (i in 0 until ints.size) {
        println(ints[i])
    }

    // Iterating without counter
    for (element in ints) {
        println(element)
    }

    ints.forEach { element -> println(element) }

    greetThings("Heyah", arrayOf("World", "Kotlin", "Programming\n"))
    greetThings2("Hello", "World 2", "Kotlin 2", "Programming 2")         // Don't need to create an array

}