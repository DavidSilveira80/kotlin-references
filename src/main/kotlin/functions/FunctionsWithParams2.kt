package functions

fun main(){
    sayHello("David", 20)
    sayHello("Pedro", 30)
    sayHello("Maria", 12)
    sayHello("Daniel", 0)
}

private fun sayHello(nome: String, temperatura: Int){
    println("Hi, $nome! Temperatura é $temperatura º")
}