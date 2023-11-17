package nullable

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que mostra um senha, substituindo seus caracteres por '*'. Se a senha for nula,
 * a senha '1234' deve ser usada, a qual deve ser mascarada depois.
 */

fun main(){
    val senha: String? = null
    val defaultSenha = "1234"

    //val mask = "".padEnd(senha?.length ?: defaultSenha.length, '*')
    val mask = "".padEnd((senha ?: defaultSenha).length, '*')

    println(senha)
    println(mask)
}