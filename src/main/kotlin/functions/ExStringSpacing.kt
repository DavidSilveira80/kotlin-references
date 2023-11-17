package functions

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva uma função que separa todos os caracteres de uma string com um espaço em branco.
 * Esta função também deve receber um parâmetro opcional indicando se a string deve ser con-
 * vertida para maiúscula.
 */

fun main(){
    println(separaCaracteres("David", true))

}

private fun separaCaracteres(string: String, isUppercase: Boolean = false): String{
    var r = ""

    for(c in string){
        r += "$c "
    }
    r = r.trim()

    if(isUppercase){
        r = r.uppercase()
    }
    return r
}