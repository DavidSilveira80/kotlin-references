package repetition

fun main(){
    for(i in 0..50){
        if(i == 20){
            break
        }else{
            print("$i ")
        }
    }
    println("FIM")
}