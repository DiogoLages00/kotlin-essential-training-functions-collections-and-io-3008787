// Char and string data types
fun main() {

    val aChar: Char = 'a'
    val aNumericChar = '1'
    val newLineChar = '\n'

    // val concatOption1 = 'a' + 'b'  // Compile Time Error - Plus operator is not designed to work with chars
    // val concatOption2 = 'ab'  // Compile Time Error - Char can only store 1 character

    val aString: String = "Hello Kotlin!"
    val escaped = "Hello \n World"
    println(escaped)

    val raw = """
       Some
        multiline
      text
        is going on
    here
    """
    println(raw)

    val raw2 = """
        |Some
        multiline
      text
        |is going on
    here
    """.trimMargin()
    println(raw2)

    val raw3 = """
        >>Some
        multiline
      text
        >>is going on
    here
    """.trimMargin(">>")
    println(raw3)

    val concatString = "Hello" + " Kotlin!"
    println(concatString)

    val concatNumber = "The number " + 10
    println(concatNumber)

    // String is always a val so when concatenate 2 strings we create a 3rd string
    // Kotlin uses string templates
    val aNumber = 10
    val concatTemplate = "The number $aNumber"
    println(concatTemplate)

    val concatTemplate2 = "The number ${1 + aNumber}"
    println(concatTemplate2)

    val someString = "Hello there!"
    println(someString.isEmpty())
    println(someString.isNotEmpty())

    val someString2 = " "
    println(someString2.isNotEmpty())
    println(someString2.isNotBlank())

    val anotherString = "Hello Kotlin World!"
    println(anotherString.contains("Kotlin"))

}