package functions

fun main(){
    sayHello2(message="Tudo Bem?")

}

private fun sayHello2(name: String = "Desconhecido", message: String = ""){
    println("Hi, $name, $message")
}