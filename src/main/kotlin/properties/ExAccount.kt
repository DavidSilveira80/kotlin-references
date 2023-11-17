package properties


/**
 * EXERCÍCIO
 * ---------
 *
 * Crie uma classe Account para representar uma conta bancária. Esta classe deve ter uma
 * PROPRIEDADE BALANCE para armazenar o saldo da conta. Quando uma conta é criada, ela pode
 * conter um saldo inicial, o qual não pode ser inferior a 0. Além disso, o saldo só pode ser
 * alterado através do MÉTODO DEPOOSIT() e WITHDRAW(), responsáveis pelos depósitos e saques
 * na conta, respectivamente
 */

fun main(){
    val conta1 = Account(10.0)
    val conta2 = Account()
    println(conta1.balance)
    conta1.deposit(10.50)
    println(conta1.balance)
    conta1.withdraw(0.50)
    println(conta1.balance)
    println(conta2.balance)
}


class Account(balance: Double = 0.0) {

    init{
        require(balance >= 0)
    }


    var balance: Double = balance
        get(){
            return field
        }
        private set

    fun deposit(value: Double){
        balance += value
    }

    fun withdraw(value: Double){
        balance -= value
    }
}

