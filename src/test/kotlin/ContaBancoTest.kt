import meutreinamento.ContaBanco
import org.junit.jupiter.api.Test
import kotlin.test.*

class ContaBancoTest {

    @Test
    fun `abrirConta - conta corrente`() {

        val abrirContaBanco = ContaBanco()


        abrirContaBanco.setTipo("Conta corrente")
        abrirContaBanco.setTitular("Renê Junior")

        abrirContaBanco.abrirConta()

        assertEquals(true, abrirContaBanco.getStatus())
        assertEquals("Conta corrente", abrirContaBanco.getTipo())
        assertEquals("Renê Junior", abrirContaBanco.getTitular())
        assertEquals(100.0, abrirContaBanco.getSaldo())
    }

    @Test
    fun `abrirConta - conta poupanca`() {

        val abrirContaBanco = ContaBanco()

        abrirContaBanco.setTipo("Conta poupança")
        abrirContaBanco.setTitular("Lucas Rafaele")

        abrirContaBanco.abrirConta()

        assert(abrirContaBanco.getStatus())
        assert(abrirContaBanco.getTipo() == "Conta poupança")
        assert(abrirContaBanco.getTitular() == "Lucas Rafaele")
        assert(abrirContaBanco.getSaldo() == 200.0)

    }

    @Test
    fun `fecharConta - verifica status e saldo`() {

        val fecharContaBanco = ContaBanco()

        fecharContaBanco.setSaldo(0.0)
        fecharContaBanco.fecharContar()

        assert(fecharContaBanco.getSaldo() == 0.0)
        assertFalse(fecharContaBanco.getStatus())
        assert(fecharContaBanco.fecharContar() == "Conta encerrada com sucesso.")

    }

    @Test
    fun `fecharConta - verifica erro ao fechar a conta`() {

        val fecharContaBanco = ContaBanco()

        fecharContaBanco.setSaldo(20.0)
        fecharContaBanco.fecharContar()

        assert(fecharContaBanco.getSaldo() < 0.0 || fecharContaBanco.getSaldo() > 0.0)
        assert(fecharContaBanco.fecharContar() == "A conta não pode ser encerrada. Verifique o saldo.")

    }

    @Test
    fun `depositar - verifica o status da conta e valor depositado`() {

        val depositarBanco = ContaBanco()

        depositarBanco.setTipo("Conta poupança")
        depositarBanco.setTitular("Lucas Rafaele")

        depositarBanco.abrirConta()

        //depositarBanco.setStatus(true)

        depositarBanco.depositar(20.0)

        assert(depositarBanco.getStatus())
        assert(depositarBanco.getSaldo() == 220.0)

    }

    @Test
    fun `depositar - verifica erro no status da conta`() {

        val depositarBanco = ContaBanco()

        depositarBanco.setStatus(false)

        assert(!depositarBanco.getStatus())
        assert(depositarBanco.depositar(40.0) == "Error! Conta informada não existente")

    }

    @Test
    fun `sacar - verifica o status da conta e valor sacado`() {

        val sacarBanco = ContaBanco()

        sacarBanco.setStatus(true)

        sacarBanco.sacar(20.0)

        assert(sacarBanco.getStatus())
        //assert(sacarBanco.)
        assert(sacarBanco.getSaldo() == 30.0)

    }

    @Test
    fun `pagamentoMensal - descontar 12 reais conta corrente`() {

        val mensalidadeBanco = ContaBanco()

        mensalidadeBanco.setTipo("Conta Corrente")
        mensalidadeBanco.pagarMensal()

        assert(mensalidadeBanco.getTipo() == "Conta Corrente")
        assert(mensalidadeBanco.getSaldo() == 38.0)

    }

    @Test
    fun `pagamentoMensal - descontar 20 reais conta poupanca`() {

        val mensalidadeBanco = ContaBanco()

        mensalidadeBanco.setTipo("Conta Poupança")
        mensalidadeBanco.pagarMensal()

        assert(mensalidadeBanco.getTipo() == "Conta Poupança")
        assert(mensalidadeBanco.getSaldo() == 30.0)

    }
}