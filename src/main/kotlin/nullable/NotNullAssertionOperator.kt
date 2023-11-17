package nullable

fun main(){
    // deve ser evitado e quando usado deve ter extremo cuidado

    val s: String? = null
    // not null assertion operator
    val i = s!!.reversed()
    println(i)

}