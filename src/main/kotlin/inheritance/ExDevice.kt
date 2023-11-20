package inheritance

/**
 * EXERCÍCICIO
 * -----------
 *
 * Crie uma classe Device que representa um dispositivo que pode estar ligado ou desligado. Crie métodos para ligar
 * e desligar o dispositivo.
 *
 * Depois, crie as classes TV e Telephone, subclasses de Device e faça com que o comportamento de ligar e desligar
 * funcione para estas subclasses
 */


fun main(){
    val d1 = Telephone()
    println(d1.isOn)
    d1.on()
    println(d1.isOn)


    val d2 = Tv()
    println(d2.isOn)


}


abstract class Device{
    var isOn: Boolean = false
        private set

    fun on(){
        isOn = true
    }

    fun off(){
        isOn = false
    }
}

class Tv : Device()

class Telephone : Device()
