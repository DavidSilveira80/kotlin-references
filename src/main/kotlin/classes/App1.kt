package classes

fun main(){
    val a1 = Account()
    val a2 = Account()

    a1.depositar(100.0)
    a2.depositar(1_000_000.0)

    a1.print()
    a2.print()
}