/*
fun main() {
    val rangeInt = 1..10
    print(rangeInt.step)
}
 */
/*
fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
        }
    println(rangeInt.step)
}
 */
/*
fun main() {
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}
 */
/*
fun main() {
    if (1 <= 7 && 7 <= 10){
        println("Value 7 available")
    }
}
 */
fun main() {
    val tenToOne = 10.downTo(1)
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }
}