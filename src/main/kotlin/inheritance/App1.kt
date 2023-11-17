package inheritance

fun main(){


    val cat = Cat("Cinza")
    val dog = Dog("Preto")
    println(dog.color)
    dog.bark()
    dog.eat()

    println()

    println(dog is Dog)
    println(dog is Animal)
    println(cat is Animal)

}