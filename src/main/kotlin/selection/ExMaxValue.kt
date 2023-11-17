package selection

/**
 * EXERCÍCIO
 * ---------
 * Escreva um programa que receba um valor numérico pelo teclado, multiplica por ele mesmo e imprime o
 * resultado.
 * Entretanto, se o valor fornecido for maior que 10, ele deve ser ajustado para 10 antes
 * de ser multiplicado.
 *
 */


fun main(){
    print("Informe um número: ")
    var numero = readln().toInt()

    if(numero > 10){
        numero = 10
        println(numero * numero)
    }else{
        println(numero * numero)
    }
}
