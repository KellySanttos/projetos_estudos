package meutreinamento.banco

abstract class Conta(titular: String, numero: String, senha: String) {

    private var titular: String = titular
    private var numero: String = numero
    private var senha: String = senha
    private var saldo: Double = 50.0
    private var status: Boolean = false

    init {
        this.abrirConta()
        this.taxaServico()

    }

    abstract fun abrirConta()

    abstract fun taxaServico()

    fun fecharContar(): String {

        if (getSaldo() == 0.0) {
            setStatus(false)
            return "Conta encerrada com sucesso."
        }
        return "A conta não pode ser encerrada. Verifique o saldo."
    }

    fun depositar(deposito: Double): String {

        if (getStatus()) {
            setSaldo(getSaldo().plus(deposito))
            return getSaldo().toString()
        }
        return "Error! A conta informada não existe"
    }

    fun sacar(saque: Double): String {

        if ((getStatus()) && (getSaldo() >= saque)) {
            setSaldo(getSaldo() - saque)
            return getSaldo().toString()
        }
        return "ERROR! Transação não autorizada! Verifique seu saldo."
    }


    fun getNumero(): String {
        return this.numero
    }

    fun setNumero(numero: String) {
        this.numero = numero
    }

    fun getTitular(): String {
        return this.titular
    }

    fun setTitular(titular: String) {
        this.titular = titular
    }

    fun getSenha(): String {
        return this.senha
    }

    fun setSenha(senha: String) {
        this.senha = senha
    }

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }

    fun getStatus(): Boolean {
        return this.status
    }

    fun setStatus(status: Boolean) {
        this.status = status
    }
}