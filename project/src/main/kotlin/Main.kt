
fun main() {

    val aInt: Int = 0   // 32 bits
    val anotherInt = 0

    val aByte: Byte = 0   // 8 bits
    val aShort: Short = 0 // 16 bits

    val aLong:Long = 0  // 64 bits
    val inferredInt = 10  // automatically an Int because is smaller than 32 bits

    val inferredLong = 1000000000000 // automatically a Long
    val anotherLong = 10L

    val unsignedInt: UInt = 0U
    val unsignedLong = 0UL

    val aDouble: Double = 5.5  // 64 bit
    val aFloat: Float = 5.5f   // 32 bit

    val inferredDouble = 5.5   // automatically a double
    val inferredFloat = 5.5f

    println(5 == 4)
    println(10f > 1)
    println(10.1 <= 5.2)

    println(10.5.toInt())
    10.9.toFloat()
    5.toULong()

    println(100_000_000.toByte())   // lost accuracy because long occupies more space than a byte
}