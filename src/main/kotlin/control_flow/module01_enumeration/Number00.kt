package control_flow.module01_enumeration

fun main(){
    val colors : Array<Color> = enumValues()
    colors.forEach { color ->
        println(color)
    }

    val color : Color = enumValueOf("RED")
    println("Color is $color")
}

enum class Color(val value: Int){
    RED(0xFF0000){
        override fun printValue(){
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue(){
            println("value of RED is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue(){
            println("value of RED is $value")
        }
    };

    abstract fun printValue()

}



