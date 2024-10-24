// While loops

fun main() {

    var counter = 0

    while (counter < 5) {
        println(counter)
        counter++

        if (counter ==3) break
    }

    do {
        println("Do while $counter")
        counter += 1
    }   while (counter < 10)

}