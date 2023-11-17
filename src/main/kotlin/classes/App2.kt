package classes

fun main(){
    val a1 = Account()
    val a2 = Account()

   a1.print()
    a2.print()

    a1.depositar(2000.0)
    a2.depositar(150.0)

    a1.print()
    a2.print()

}