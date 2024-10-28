import java.io.File
import kotlin.io.path.writeLines

// Challenge: Parsing a list of data from a file


// Prompt the user to enter the name of the test scores file
// Read each line from the file
// Sort the scores from highest to lowest
// Pick the 3 highest scores
// Write those 3 userId/score pairs to a new file sorted.txt

fun main() {

    print("Enter the name of the file: ")
    val filename = readLine()

    if (filename.isNullOrEmpty()) {
        println("Invalid filename")
        return
    }

    val file = File(filename)
    if (!file.isFile) {
        println("Invalid file")
        return
    }

    val sortedFile = file.readLines()
        .map { it ->
            val elements = it.split(":")
            elements[0] to elements[1]
        }
        .sortedByDescending { it.second }
        .take(3)
        //.forEach { println(it) }

    val outputFile = File("sorted.txt").toPath()

    val bestScores = sortedFile.map {
        "${it.first}:${it.second}"
    }
    outputFile.writeLines(bestScores)

}