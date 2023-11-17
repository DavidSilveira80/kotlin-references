package functions

fun main(){
    sayHello("David")
    sayHello("Pedro")
    sayHello("Maria")
    sayHello("Daniel")
}

private fun sayHello(nome: String){
    println("Hi, $nome")
}