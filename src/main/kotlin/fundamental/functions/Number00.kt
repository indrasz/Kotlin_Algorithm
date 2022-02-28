package fundamental.functions

fun main(){
    val user = setUser1("Wahyu Indra", 19)
    println(user)

    printUsername("Wahyu Indra")
}

//Example 1 (Return Type)
fun setUser(name: String, age: Int) : String {
    return "My Name is $name, $age years old"
}

//Example 2 (Return Type)
fun setUser1(name: String, age: Int) : String = "My Name is $name, $age years old"
//Or
fun setUser2(name: String, age: Int) = "My Name is $name, $age years old"

//Example 3 (Don't use Return Type)
fun printUsername(name: String) {
    println("My Name is $name")
}

/*
    How to read function in kotlin
    fun functionName(parameters : Type) : ReturnType {
        return result
    }
*/
