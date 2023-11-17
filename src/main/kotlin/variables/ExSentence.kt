package variables
import java.text.DecimalFormat
/**
 * EXERCÍCIO
 * ---------
 *
 * Solicite 3 informações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha essas
 * informações (use string templates para montar a frase
 */

fun main(){
    print("Informe seu nome: ")
    val nome = readln()
    print("Informe sua idade: ")
    val idade = readln().toInt()
    print("Informe seu peso: ")
    val peso = readln().toDouble()

    val frase = "Seu nome é $nome você tem $idade anos de idade e você pesa $peso Kg."

    println(frase)

}