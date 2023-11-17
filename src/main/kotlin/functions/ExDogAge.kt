package functions

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva uma função que calcula a idade humana equivalente de um cachorro, considerando que cada ano
 * que um cachorro vive coreresponde a 7 anos de vida de um ser humano. O valor da idade deve ser
 * fornecido via teclado.
 */

fun main(){
    print("Informe a idade do cão: ")
    val idadeDoCao = readln().toInt()
    println(calcularIdadeCao(idadeDoCao))
}

private fun calcularIdadeCao(idadeCao: Int): String{
    val idadeCaoEmRelacaoAoHumano = idadeCao * 7
    return "A idade do cam em relação com a do humano é $idadeCaoEmRelacaoAoHumano."
}