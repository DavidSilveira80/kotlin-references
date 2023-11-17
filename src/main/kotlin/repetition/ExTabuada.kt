package repetition

/**
 * EXERCÍCIO
 * ---------
 *
 * Imprima na tela a tabuada de um numero de 1 a 10. O número deve ser fornecido pelo usuário.
 *
 */

fun main(){
    print("Informe o multiplicador: ")
    val multiplicador = readln().toInt()

    var multiplicando = 1

    while(multiplicando <= 10){
        println("$multiplicando X $multiplicador = ${multiplicando * multiplicador}")
        multiplicando++
    }
}