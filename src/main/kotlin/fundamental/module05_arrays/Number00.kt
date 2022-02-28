package fundamental.module05_arrays

fun main(){
    //example simple array with library function arrayOf()
    val array = arrayOf(1,3,5,7)

    /*
     specific function
     intArrayOf() : IntArray
     booleanArrayOf() : BooleanArray
     charArrayOf() : CharArray
     longArrayOf() : LongArray
     shortArrayOf() : ShortArray
     byteArrayOf() : ByteArray
     */

    val intArrayOf = arrayOf(1,3,5,7)
    println(intArrayOf[3])

    //example simple array with library function Array()

    val intArray = Array(4) { i -> i * i }
    println(intArray[2])

    /*
    NOTED
    Array() Construction need 2 argument
    - size
    - lambda function
     */


}