package meutreinamento.banco

class CaixaEletronico {
    private var contas: MutableList<Conta> = mutableListOf()

    fun iniciar() {

        do {
            println(
                """
            Caixa Eletrônico iniciado.
            Seguintes opções: 
            1 - Abrir Conta
            2 - Depositar
            3 - Sacar
            4 - Extrato
            5 - Sair
            
            Escolha uma das opções acima.
        """.trimIndent()
            )

            var entradaDado = readln()
            when (entradaDado) {
                "1" -> {
                    println(
                        """
                    Qual tipo de conta deseja criar?
                    1 - Conta Poupança
                    2 - Conta Corrente
                """.trimIndent()
                    )

                    entradaDado = readln()
                    println("Insira seu nome: ")
                    val nomeTitular = readln()
                    println("Insira o número da conta: ")
                    val numeroConta = readln()

                    when (entradaDado) {
                        "1" -> {
                            contas.add(ContaPoupanca(nomeTitular, numeroConta, "123"))
                        }

                        "2" -> {
                            contas.add(ContaCorrente(nomeTitular, numeroConta, "123"))
                        }

                        else -> {
                            println("Opção Inválida")
                        }
                    }
                }

                "2" -> {
                    println("Número da conta a depositar")
                    val contaADepositar = readln()

                    println("Qual valor deseja depositar?")
                    val valorADepositar = readln().toDouble()

                    depositar(contaADepositar, valorADepositar)
                }

                "3" -> {
                    println("Número da conta que deseja fazer saque")
                    val contaASacar = readln()

                    println("Valor do saque")
                    val valorASacar = readln().toDouble()

                    sacar(contaASacar, valorASacar)
                }

                "4" -> {
                    println("Digite o número da conta")
                    val numeroDaConta = readln()

                    println(verSaldo(numeroDaConta))
                }
            }
        } while (entradaDado != "5")
    }

    fun depositar(numeroConta: String, valor: Double) {
        val conta = buscarContaPorNumero(numeroConta)
        conta?.depositar(valor)
    }

    fun sacar(numeroConta: String, valor: Double) {
        val conta = buscarContaPorNumero(numeroConta)
        conta?.sacar(valor)
    }

    fun verSaldo(numeroConta: String): Double? {
        val conta = buscarContaPorNumero(numeroConta)
        return conta?.getSaldo()
    }

    private fun buscarContaPorNumero(numeroConta: String): Conta? {
        return contas.find { it.getNumero() == numeroConta }
    }
}


// agregação
// composição