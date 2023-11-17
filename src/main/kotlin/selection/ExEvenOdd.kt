package selection

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é par ou ímpar.
 */

fun main(){
    print("Informe um número: ")
    val numero = readln().toInt()

    if(numero % 2 == 0){
        println("O número é PAR")
    }else{
        println("O número é ÍMPAR")
    }
}