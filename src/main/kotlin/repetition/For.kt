package repetition

fun main(){

    for(i in 0..10){
        print("$i ")
    }

    println()

    for(a in 10 downTo 0 step 2){
        print("$a ")
    }

    println()

    for(c in 10 until 100 step 3){
        print("$c ")
    }
}