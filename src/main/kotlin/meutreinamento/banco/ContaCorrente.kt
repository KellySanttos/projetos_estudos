package meutreinamento.banco

class ContaCorrente(titular: String, numero: String, senha: String) : Conta(titular, numero, senha) {
    override fun abrirConta() {
        setSaldo(getSaldo() + 50.0)
        setStatus(true)
    }

    override fun taxaServico() {
        setSaldo(getSaldo().minus(12.0))
    }
}