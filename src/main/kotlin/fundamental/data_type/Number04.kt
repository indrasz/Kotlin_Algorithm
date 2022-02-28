package fundamental.data_type

fun main(){
    // Safe Calls Operator
    /*
    how to use safe calls?
    change (.) become (?.) when accessing nullable object
     */

    //example
    val text : String? = null
    text?.length

    /*
    NOTE
    With a safe call, the compiler will skip the process if the object is null.
     */

    //Elvis Operator
    /*
    how to use elvis operator?
    set default value use (?:)
     */

    val textLength = text?.length ?: 7
    //val textLength = if (text != null) text.length else 7


    //Non-Null Assertion (!!)
    //Example

    val textLengthNull = text!!.length

    /*
    NOTE
    not recommended
    because forced object becomes NULL
     */
}