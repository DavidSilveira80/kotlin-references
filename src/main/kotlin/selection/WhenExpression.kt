package selection

fun main(){
    val x = 0
    val s = when {
        x > 0 -> "POSITIVO"
        x < 0 -> "NEGATIVO"
        else -> "ZERO"
    }
    println(s)

    val c = 'b'

    val v = when(c){
        'A', 'a' -> 1
        'B', 'b' -> 2
        else -> 3
    }
    println(v)
}