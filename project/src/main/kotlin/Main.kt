// Working with collections


fun main() {

    val readOnlyList = listOf(1, 2, 3)
    val readOnlySet = setOf(1, 2, 3, 1)
    val readOnlyMap = mapOf(1 to "a", 2 to "b")

    val mutableList = mutableListOf(1, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3, 1)
    val mutableMap = mutableMapOf(1 to "a", 2 to "b")

    println(mutableList.size)
    println(readOnlyMap.size)

    println(mutableSet.isEmpty())
    println(readOnlyList.isNotEmpty())

    for (element in readOnlySet) {
        println(element)
    }

    mutableMap.forEach { key, value -> println(key)  }
    mutableMap.forEach { it -> println(it) }                // it is a map entry - return "key=value"

    println(readOnlyList.first())               // retrieve first item
    println(mutableSet.first())

    println(mutableList.take(2))            // retrieve first 2 items
    println(readOnlySet.take(3))

    // Filter collection - it doesn't change the collections
    mutableMap.filter { entry -> entry.key < 2  }
    println(readOnlyList.filter { it > 1})

    val languages = mapOf(
        "kotlin" to 5,
        "java" to 3,
        "javascript" to 4,
        "c++" to 2,
        "python" to 6
    )

    // Convert map entries to list - it doesn't change the collection
    languages.filter { it.value >= 4 }
        .map { it.key }
        .sorted()
        .forEach { println(it) }

}