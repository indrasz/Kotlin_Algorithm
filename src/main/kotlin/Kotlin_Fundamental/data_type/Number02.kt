package Kotlin_Fundamental.data_type

fun main(){
    //Int 32 Bit
    val intNumber = 100

    //Long 64 Bit
    val longNumber : Long = 100
    val longNumber1 = 100L

    //Short 16 Bit
    val shortNumber : Short = 10

    //Byte 8 Bit
    val byteNumber = 0b11010010

    //Double 64 Bit
    val doubleNumber = 1.3

    //Float 32 Bit
    val floatNumber : Float = 0.123456789f //which reads only 0.1234567

    //Readable Number
    val readableNumber = 1000_000_000

    /*
       count total passenger
     */
    var passenger : Int = 0
    passenger += 5
    passenger += 7
    passenger += 8
    passenger += 9
    println("Total Passenger is a $passenger")

    /*
        Arithmetic
     */
    val valueA : Int = 2
    val valueB : Int = 2

    print("""
        Summation : ${valueA + valueB}
        Subtraction : ${valueA - valueB}
        Multiplication : ${valueA * valueB}
        Distribution : ${valueA / valueB}
        Modulus : ${valueA % valueB}
    """.trimIndent())


}