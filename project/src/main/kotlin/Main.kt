// Nullable Types

fun main() {

    // var aNullableString: String = null  // Compile Time Error - Null Safety
    var aNullableString: String? = null
    aNullableString = "kotlin"

    var aNullableString2: String? = null
    // println(aNullableString2.length)    // Compile Time Error - Needs to ensure its not null (null asertion)
    // println(aNullableString2!!.length)   // Run Time Error - Null Pointer Exception because is null
    aNullableString2 = "some value"
    println(aNullableString2.length)  // Doesn't need the assertion

    aNullableString2 = null
    println(aNullableString2?.length)  // Doesn't crash but returns null value
    println(aNullableString2?.length ?: "the value was null")  // if is null returns the string

    aNullableString2 = "some value"
    println(aNullableString2.length ?: "the value was null")
}