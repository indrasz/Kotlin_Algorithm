package Kotlin_Fundamental.if_expression

import java.util.Scanner

fun main(){
    /*
    check multiple six program
     */
    val input = Scanner(System.`in`)
    val multiple : Int = input.nextInt()

    // check value true or false
    if(multiple % 2 == 0) println("Multiple of Six") // true
    else println("not multiple of six") // false

    /*
    NOTED: Kotlin Ternary Operator is not Support
     */
}