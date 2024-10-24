// for loops


fun main() {

    for (i in 0 until 5) println(i)             // until - Exclude last number

    for (i in 0..5) println(i)                  // .. - Include last number

    for (i in 10 downTo 5) println(i)           // downTo - Include last number

    for (i in 10 downTo 0 step 3) println(i)           // step - Jump 3 values each time

}