package polimorphism

fun main(){
    val p = Programmer()
    p.work()

    val t = Teacher()
    t.work()
}


abstract class Employe {

    abstract fun work()

}

class Programmer : Employe(){
    override fun work() {
        println("Programmer Working...")
    }

}

class Teacher : Employe(){
    override fun work() {
        println("Teacher Working...")
    }
}