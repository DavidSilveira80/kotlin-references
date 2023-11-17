package classes

fun main(){
    val a1 = Account("000123", "David")
    val a2 = Account("000124", "Lizi")
    val a3 = Account()
    val a4 = Account("000125", "Daniel", 10000.0)
    val a5 = Account()

    a5.print()

    a5.depositar(200)

    a1.print()
    a2.print()
    a3.print()
    a4.print()
    a5.print()

}