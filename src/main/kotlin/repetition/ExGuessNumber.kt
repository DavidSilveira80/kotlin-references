package repetition

import kotlin.random.Random

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório dentro de um intervalo
 * e você deve tentar descobri-lo. Acada tentativa, o programa diz se o número é maior ou menor do que o número
 * tentado.
 * O jogo acaba quando o número tentado for o número correto.
 */

fun main(){
    val secret =Random.nextInt(0, 11)
    var playing = true
    while(playing){
        print("> ")
        val n = readln().toInt()

        if(n == secret){
            println("Você descobriu o número secreto $secret")
            break
        }else{
            println("ERROU, TENTE NOVAMENTE")
        }

    }
}