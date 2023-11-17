package selection

/**
 * EXERCÍCIO
 * ---------
 *
 * Implemente uma calculadora capaz de executar as 4 operações básicas e que recebe os dados via teclado.
 * Tês informações devem ser passadas: o primeiro operando, a operação matema´tica e osegundo operando.
 * Por exemplo:
 * > 20
 * +
 * > 4
 * Resultado: 24
 */

fun main(){

    print("Informe o primeiro operando: ")
    val a = readln().toInt()
    print("Informe a operação -> - + x / : ")
    val operador = readln()
    print("Informe o segundo operando: ")
    val b = readln().toInt()

    when(operador){
        "-" -> println("$a - $b = ${a - b}")
        "+" -> println("$a + $b = ${a + b}")
        "x" -> println("$a x $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println(0)
    }
}