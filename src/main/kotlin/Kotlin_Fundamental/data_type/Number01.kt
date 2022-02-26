package Kotlin_Fundamental.data_type

fun main(){
    var character : Char = 'A'
    //count character
    println("""
        Character ${character++}
        Character ${character++}
        Character ${character++}
        Character ${character++}
        Character ${character++}
        Character ${character--}
        Character ${character--}
        Character ${character--}
        Character ${character--}
        Character ${character--}
        Character ${character--}
    """.trimIndent())

    //get first char
    val text = "Character"
    val firstchar = text[0]
    println("First Char is a $firstchar")

    //loop the char
    for (char in text) print("$char ")

}