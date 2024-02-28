package meutreinamento.banco

class CaixaEletronicoDois {
    private var contas: MutableList<Conta> = mutableListOf()

    fun iniciarCaixaEletronico() {

        do {
            println(
                """
            Caixa Eletrônico iniciado.
            
            Seguintes opções: 
            1 - Abrir conta
            2 - Fazer login
            3 - Sair
            
            Escolha uma das opções acima.
        """.trimIndent()
            )
            val entradaDado = readln()

            when (entradaDado) {
                "1" -> abrirConta()
                "2" -> {
                    print("Insira o número da conta: ")
                    val numeroDaConta = readln()
                    print("Insira sua senha: ")
                    val senhaDaConta = readln()

                    val login = fazerLogin(numeroDaConta, senhaDaConta)

                    if (login != null) {
                        operacoes(login)
                    }
                }

                "3" -> println("\nCaixa eletrônico encerrado.")
                else -> println("\nOpção inválida")
            }
        } while (entradaDado != "3")
    }

    private fun abrirConta() {
        println(
            """
                
            Qual tipo de conta deseja criar?
            1 - Conta Poupança
            2 - Conta Corrente
            
            """.trimIndent()
        )
        val entradaDeDado = readln()

        print("Insira seu nome: ")
        val nomeTitular = readln()
        print("Insira o número da conta: ")
        val numeroConta = readln()
        print("Insira uma senha: ")
        val senhaConta = readln()

        when (entradaDeDado) {
            "1" -> contas.add(ContaPoupanca(nomeTitular, numeroConta, senhaConta))
            "2" -> contas.add(ContaCorrente(nomeTitular, numeroConta, senhaConta))
            else -> println("\nOpção inválida")
        }
    }

    private fun fazerLogin(numeroConta: String, senhaConta: String): Conta? {
        val contaExiste = contas.find { it.getNumero() == numeroConta }

        if (contaExiste == null) {
            println("Conta não encontrada")
            return null
        }

        if (contaExiste.getSenha() != senhaConta) {
            println("\nFalha no login")
            return null
        }
        println("\nLogin validado com sucesso")
        return contaExiste
    }

    fun operacoes(conta: Conta) {
        do {
            println(
                """
                    
            Qual a operação que deseja realizar?
            1 - Depositar
            2 - Sacar
            3 - Extrato
            4 - Voltar
            
        """.trimIndent()
            )
            val entradaDado = readln()

            when (entradaDado) {
                "1" -> {
                    print("Valor: ")
                    val valorADepositar = readln().toDouble()
                    println("Valor de R$$valorADepositar depositado com sucesso")

                    depositar(conta, valorADepositar)
                }

                "2" -> {
                    println("Valor: ")
                    val valorASacar = readln().toDouble()

                    sacar(conta, valorASacar)
                }

                "3" -> {
                    println("Saldo: ${verSaldo(conta)}")
                }
            }
        } while (entradaDado != "4")
    }

    fun depositar(conta: Conta, valor: Double) {
        conta.depositar(valor)
    }

    fun sacar(conta: Conta, valor: Double) {
        conta.sacar(valor)

        if (valor <= conta.getSaldo()) {
            println("Valor de R$$valor sacado com sucesso")
        } else {
            println("ERROR! O valor não pode ser sacado.")
        }
    }

    fun verSaldo(conta: Conta): Double {
        return conta.getSaldo()
    }

    private fun buscarContaPorNumero(numeroConta: String): Conta? {
        return contas.find { it.getNumero() == numeroConta }
    }
}

// myqsl
// rest
// postman