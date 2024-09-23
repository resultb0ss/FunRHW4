import kotlin.math.sqrt

fun main() {
    val num = 25
    println(num.getSqrt())

}

fun Int.getSqrt(): Double{
    val result = sqrt(this.toDouble())
    return result
}