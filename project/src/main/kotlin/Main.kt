// Sequences


fun main() {

    val languages = listOf("kotlin", "c++", "java")
        .filter { it.length > 4 }
        .map { it.length }
        // .forEach { println(it) }

    // Sequences are iterable containers - apply all processes individually to each item in the collection
    val languageSequence = sequenceOf("kotlin", "c++", "java")
    val fromIterable = listOf(1, 2, 3).asSequence()

    // Sequences are depth first iterables
    languageSequence.filter { it.length > 4 }
        .map { it.length }
        .take(2)
        .forEach { println(it) }

    // Iterable vs Sequences
    // Smaller collections (10s or 100s) - Iterable
    // Larger collections (1000s) - Sequences



}