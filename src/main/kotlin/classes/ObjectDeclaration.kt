package classes

fun main(){
    println(Math2.sum(20, 10))
    println(Math2.subtrair(20, 10))
    println(Math2.pi)

}

object Math2{

    val pi = 3.1416

    fun subtrair(A: Int, B: Int) = A - B

    fun sum(a: Int, b: Int) = a + b
}