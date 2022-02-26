package Kotlin_Fundamental.data_type

fun main(){
    var variableControl1 : String = "Variable"
    //variabel yang bisa diganti

    val variableControl2 : String = "Variable"
    //variabel yang tidak bisa diganti

    println("""
        This Variable 1 $variableControl1
        and This Variable 2 $variableControl2
    """.trimIndent())

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