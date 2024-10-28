// Challenge: Filtering a list of data


fun main() {
    // Using the provided test scores, identify the 3 students
    // with the lowest test scores

    val lowestScores = testScores.entries
        .sortedBy { it.value }
        .take(3)
        .forEach { println(it.key) }

}