package fundamental.module02_data_type

fun main(){
    // NullPointerException(NPE) alias "The Billion Dollar Mistake"

    /*
        example
        val text: String = null //compile time error
     */

    val text : String? = null

    /*
        but cannot access if marked by nullable
        example
        val text : String? = null
        val textLength = text.length  //compile time error
     */

    //solution use if expression
     if(text != null){
         val textLength = text.length
     }


}