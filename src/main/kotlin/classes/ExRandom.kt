package classes

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie a classe CharGenerator, capz de gerar aleatoreamente um caracter dentro de um intervalo
 * fornecido no momento da criação do objeto.
 */

fun main(){
    val g = CharGenerator('A', 'Z')
    println(g.next())
    println(g.next())
    println(g.next())

}

class CharGenerator(
    val min: Char,
    val max: Char
){
    fun next() = (min..max).random()

}