package polimorphism

fun main(){

}

open class Drink{
    open fun prepare(){
        println("Prepare Drink")
    }
}

class Coffee : Drink(){

    override fun prepare() {
        println("Prepare COFFEE")
    }
}