package operators

/**
 * EXERCÍCIO
 * ---------
 *
 * Encontre o resultado da seguinte expressão:
 *
 * (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
 */

fun main(){
    // primeiramente parenteses, aritméticos, relacionais e lógicos
    val exp = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)

    // 8 * 2 < 30 / 2 || !(4 <= 2)
    // 16 < 30 / 2 || !(4 <= 2)
    // 16 < 15 || !(4 <= 2)
    // F || !(4 <= 2)
    // F || !F
    // F || T
    // T
    println(exp)

}