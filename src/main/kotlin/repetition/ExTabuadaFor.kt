package repetition

/**
 * Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário.
 * Utilize a estrutura de repetição FOR para resolver o exercício.
 */

fun main(){
    print("Informe qual tabuada você quer ver: ")
    val tabuada = readln().toInt()

    for(i in 1..10){
        println("$tabuada X $i = ${tabuada * i}")
    }
}