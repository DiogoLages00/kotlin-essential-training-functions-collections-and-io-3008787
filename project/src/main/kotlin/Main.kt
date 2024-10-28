// Command-line arguments


fun main(vararg args: String) {

    if (args.isEmpty()) {
        println("Please pass at least one argument")
        return
    }

    // Configuration changes are needed so that args[0] doesn't throw an ArrayIndexOutOfBounds
    println("First arg is ${args[0]}")

    for (arg in args) println(arg)

}