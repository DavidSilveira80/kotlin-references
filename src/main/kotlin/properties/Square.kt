package properties

fun main(){
    val s1 = Square(10)
    val s2 = Square(20)

}

class Square(val size: Int){
    // Ótimo para fazer validações
    init{
        println("Init1")
        require(size > 0)
    }

    init{
        println("Init2")
    }

}