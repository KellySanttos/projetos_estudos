package meutreinamento.banco

class ContaPoupanca(titular: String, numero: String, senha: String): Conta(titular, numero, senha) {

    override fun abrirConta() {
        setSaldo(getSaldo().plus(150.0))
        setStatus(true)
    }

    override fun taxaServico() {
        setSaldo(getSaldo().minus(20.0))
    }
}