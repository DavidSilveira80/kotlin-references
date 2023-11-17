package operators

fun main(){
    // Operam dois elementos lógicos e dão como retorno outro elemento lógico

    // Tabela-verdade

    // AND
    println("T AND T ${true && true}")
    println("T AND F ${true && false}")
    println("F AND T ${false && true}")
    println("F AND F ${false && false}")

    println()

    // OR
    println("T OR T ${true || true}")
    println("T OR F ${true || false}")
    println("F OR T ${false || true}")
    println("F OR F ${false || false}")

    println()

    // NOT
    // É um operador unário, opera em um só operando lógico
    println("NOT F ${!false}")
    println("NOT T ${!true}")

}