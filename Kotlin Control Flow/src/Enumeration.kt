/*
fun main(){
    val color:Color = Color.RED
    print(color)
}
enum class Color{
    RED,GREEN,BLUE
}
 */

enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };
    abstract fun printValue()
}

/*
fun main() {
    val colors: Array <Color> = Color.values()
    colors.forEach { color ->
        print (color)
    }
}
enum class Color(val value: Int) {
    RED(0xFF0000) ,
    GREEN(0x00FF00) ,
    BLUE(0x0000FF)
}
 */

/*
fun main() {
    val color: Color = Color.valueOf("RED")
    print("Color is $color")
}
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
*/

/*
fun main() {
    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }
    val color: Color = enumValueOf("RED")
    println("Color is $color")
}
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
*/

/*
fun main() {
    val color: Color = Color.GREEN
    print("Position GREEN is ${color.ordinal}")
}
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


/*
fun main() {
    val color: Color = Color.GREEN
    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
*/