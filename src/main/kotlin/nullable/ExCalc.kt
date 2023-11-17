package nullable

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que solicita um número a um usuário, multiplica ele por 2 vezes e subtrai 10.
 * Se o usuário digitar algo que não possa ser convertido em um número, o número dever ser assumido com padrão.
 * O programa deve calcular o valor do número e mostra-lo na tela em uma única expressão.
 */

fun main(){
    print("Informe um número: ")
    println(readln()
        .toIntOrNull()
        ?: 2
        .times(2)
        .times(2)
        .minus(10))

}