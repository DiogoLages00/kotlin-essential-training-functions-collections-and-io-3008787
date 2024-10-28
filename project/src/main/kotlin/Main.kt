import java.io.File

// Challenge: Parsing a list of data from a file


// Prompt the user to enter the name of the test scores file
// Read each line from the file
// Sort the scores from highest to lowest
// Pick the 3 highest scores
// Write those 3 userId/score pairs to a new file sorted.txt

fun main() {

    print("Enter the name of the file: ")
    val filename = readLine() ?: ""

    val file = File(filename)
    if (!file.isFile) {
        println("Invalid file")
        return
    }

    val sortedFile = file.readLines()
        .map { it -> it.split(":")[1] }
        .sortedDescending()
        .take(3)
        .forEach { println(it) }

}