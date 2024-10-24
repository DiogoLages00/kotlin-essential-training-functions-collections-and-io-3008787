// Sets and maps


fun main() {

    // SETS
    // val languages: Set<String> = setOf("Kotlin", "Java", "C++")      // explicit type declaration
    val languages = setOf("Kotlin", "Java", "C++", "Kotlin")       // No repeated values
    for (language in languages) { println(language) }

    println(languages.size)
    println(languages.contains("Kotlin"))

    //languages.add("JavaScript")     // Doesn´t exist because the set is non-mutable

    //val languages2: Set<String> = mutableSetOf("Kotlin", "Java", "C++")      // Non mutable because is not MutableSet
    //languages.add("JavaScript")
    val languages2: MutableSet<String> = mutableSetOf("Kotlin", "Java", "C++", "Kotlin")
    languages2.add("JavaScript")
    languages2.remove("C++")
    for (language2 in languages2) { println(language2) }

    println()

    // MAPS
    val testScores = mapOf(Pair("Kotlin", 19.2), Pair("Java", 16.5), "Programming" to 79.1)
    println(testScores["Kotlin"])

    for (record in testScores) {        // record is an entry<K,V> of the map
        println("Record: $record")
        println("Record Key: $record.key and Value: $record.value")
    }
    for ((id, score) in testScores) {
        println("Record Key: $id and Value: $score")
    }

    testScores.containsKey("Kotlin")
    testScores.containsValue(19.2)

    testScores.forEach { println(it) }          // prints an entry<K, V> of the map
    testScores.keys.forEach { println(it) }     // prints the keys of the map

    val testScores2 = mutableMapOf(Pair(55951, 20), Pair(53200, 20), 44511 to 11)
    testScores2[55951] = 15
    testScores2.put(222, 14)
    for ((id, score) in testScores2) {
        println("Record Key 2: $id and Value 2: $score")
    }

    testScores2.remove(222)
    testScores2.replace(44511, 12)
    // testScores2.replace(0, 0)           // Does nothing because it does not exist
    for ((id, score) in testScores2) {
        println("Record Key 2: $id and Value 2: $score")
    }

}