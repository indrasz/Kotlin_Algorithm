package fundamental.module02_data_type

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

    println()

    //quotation mark
    println("My Name is \"Wahyu Indra\"")

    /*
     NOTED escaped type :
     \t = add tab to text
     \n = add new line to text
     \` = add single quote char to text
     \" = add double quote char to text
     \" = add backlash char to text
    */

    val unicode = "Unicode Example : \u00A9"
    println(unicode)

}