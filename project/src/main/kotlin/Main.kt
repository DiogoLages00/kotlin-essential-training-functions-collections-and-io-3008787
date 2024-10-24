// Lists


fun main() {

    val stringList: List<String> = listOf("kotlin", "code", "puppy")
    val listOfInt = listOf(1, 2, 3, null)       // Inferred type - nullable list

    val doubledValues = List<Int>(5) { index -> 2 * index }
    doubledValues.forEach{ println(it) }

    val emptyStringList = emptyList<String>()
    val emptyStringList2: List<String> = emptyList()

    val firstInt = listOfInt.get(0)
    val secondInt = listOfInt[1]

    //listOfInt[0] = 9            // Compile Error because list is non-mutable

    // MutableList
    val languages = mutableListOf("Kotlin", "Java")

    languages[0] = "C++"
    for (e in languages) { println(e) }
    languages.set(0, "Kotlin again YAYYY")
    for (e in languages) { println(e) }

    languages.add("JavaScript")
    for (e in languages) { println(e) }
    languages.add(1, "C++ again yikes")
    for (e in languages) { println(e) }

    languages.remove("JavaScript")
    languages.removeAt(1)
    for (e in languages) { println(e) }

    val aList: List<String> = mutableListOf("dog", "cat")   // When masked the underlying mutable list type
    // aList.add("mouse")           // Compile error - cannot manipulate directly the list

}