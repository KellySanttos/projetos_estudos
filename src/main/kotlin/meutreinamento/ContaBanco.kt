package meutreinamento

class ContaBanco {

    private var tipo: String = ""
    private var titular: String = ""
    private var saldo: Double = 0.0
    private var status: Boolean = false


    init {
        saldo = 50.0
    }

    fun abrirConta() {

        val contaCorrente = getSaldo() + 50.0
        val contaPoupanca = getSaldo() + 150.0

        when (getTipo()) {
            "Conta corrente" -> setSaldo(contaCorrente)
            "Conta poupança" -> setSaldo(contaPoupanca)
        }

        setStatus(true)

    }

    fun fecharContar(): String {

        if (getSaldo() == 0.0) {
            setStatus(false)
            return "Conta encerrada com sucesso."
        }
        return "A conta não pode ser encerrada. Verifique o saldo."
    }

    fun depositar(deposito: Double): String {

        if (getStatus()) {

            setSaldo(getSaldo() + deposito)

            return getSaldo().toString()
        }
        return "Error! Conta informada não existente"
    }

    fun sacar(saque: Double): String {

        if ((getStatus()) && (getSaldo() > saque)) {

            setSaldo(getSaldo() - saque)

            return getSaldo().toString()
        }
        return "ERROR! Transação não autorizada."
    }

    fun pagarMensal() {

        val contaCorrente: Double = getSaldo() - 12.0
        val contaPoupanca: Double = getSaldo() - 20.0

        when(getTipo()) {
            "Conta Corrente" -> setSaldo(contaCorrente)
            "Conta Poupança" -> setSaldo(contaPoupanca)
        }

    }


    fun getTitular(): String {
        return this.titular
    }

    fun setTitular(titular: String) {
        this.titular = titular
    }

    fun getTipo(): String {
        return this.tipo
    }

    fun setTipo(tipo: String) {
        this.tipo = tipo
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