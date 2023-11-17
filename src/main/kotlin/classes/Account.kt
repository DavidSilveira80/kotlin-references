package classes

class Account(
    // construtor primário
    val numeroDaConta: String,
    val nomeCliente: String
) {

    // construtor secundário
    constructor() : this("", ""){
        println("Chamado Construtor Secundário")
    }

    // Outro Construtor
    constructor(numeroDaConta: String, nomeCliente: String, saldo: Double) : this(numeroDaConta,
                                                                                  nomeCliente){
        this.saldo = saldo
    }


    // Propriedades
    private var saldo: Double = 0.0


    // Métodos
    fun depositar(valor: Double){
        saldo += valor
    }

    // Sobrecarga de método
    fun depositar(valor: Int){
        saldo += valor
    }

    fun print(){
        println("Número: $numeroDaConta; Cliente: $nomeCliente; Saldo: $saldo")
    }
}