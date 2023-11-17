package classes

fun main(){
    val p1 = Pessoa()

    p1.caminha()
    p1.caminha()
    p1.caminha()
    p1.caminha()
    p1.caminha()
    p1.caminha()
    p1.beberAgua()
    p1.caminha()

    println("A Pessoa andou ${p1.fimCaminhada()}m")


}

private class Pessoa() {
    private var distancia = 0
    private var distanciaParaAgua = 5000

    fun caminha(){
        if(distanciaParaAgua > 0){
            distancia += 1000
            distanciaParaAgua -= 1000
        }
    }

    fun beberAgua(){
        distanciaParaAgua = 5000
    }

    fun fimCaminhada() : Int{
        return distancia

    }

}