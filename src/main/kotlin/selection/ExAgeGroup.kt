package selection

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos abaixo:
 *
 * - CRIANÇA: 0 a 12 anos
 * - ADOLESCENTE: 13 a 17 anos
 * - ADULTO: 18 a 65 anos
 * - SÊNIOR: 66 anos ou mais
 */

fun main(){
    print("Informe a sua idade: ")
    val idade = readln().toInt()

    if(idade >= 0 && idade <= 12 ){
        println("CRIANÇA")
    } else if(idade >= 13 && idade <= 17){
        println("ADOLESCEMTE")
    } else if(idade >= 18 && idade <= 65){
        println("ADULTO")
    } else if(idade >= 66){
        println("SÊNIOR")
    }
}