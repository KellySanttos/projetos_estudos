import meutreinamento.banco.ContaPoupanca
import org.junit.jupiter.api.Test
import kotlin.test.*

class ContaPoupancaTest {

    @Test()
    fun `abrirConta() valida a abertura da conta poupanca`() {
        val abrirContaPoupanca = ContaPoupanca("Kelly Alves", "123456", "1234")

        abrirContaPoupanca.abrirConta()

        assertEquals(true, abrirContaPoupanca.getStatus())
        assertEquals(200.0, abrirContaPoupanca.getSaldo())
        assertEquals("Kelly Alves", abrirContaPoupanca.getTitular())
    }

    @Test
    fun `taxaServico() - valida o desconto mensal da taxa de servico Poupanca`() {
        val taxaServicoContaPoupanca = ContaPoupanca("Kelly Alves", "123456", "1234")

        taxaServicoContaPoupanca.abrirConta()
        taxaServicoContaPoupanca.taxaServico()

        assertEquals(180.0, taxaServicoContaPoupanca.getSaldo())
    }

    @Test
    fun `depositar() - verifica o status da conta e saldo apos deposito na ContaPoupanca`() {

        val depositarContaPoupanca = ContaPoupanca("Kelly Alves", "123456", "1234")

        depositarContaPoupanca.abrirConta()
        depositarContaPoupanca.taxaServico()

        depositarContaPoupanca.depositar(20.0)

        assertEquals(true, depositarContaPoupanca.getStatus())
        assertEquals(200.0, depositarContaPoupanca.getSaldo())

    }

    @Test
    fun `depositar() - verifica erro no status da conta`() {

        val depositarContaPoupanca = ContaPoupanca("Kelly Alves", "123456", "1234")

        depositarContaPoupanca.setStatus(false)

        assertFalse(depositarContaPoupanca.getStatus())
        assert(depositarContaPoupanca.depositar(40.0) == "Error! A conta informada não existe")

    }

    @Test
    fun `sacar() - verifica o status da conta e saldo apos o saque na ContaPoupanca`() {

        val sacarContaPoupanca = ContaPoupanca("Kelly Alves", "123456", "1234")

        sacarContaPoupanca.abrirConta()
        sacarContaPoupanca.taxaServico()

        sacarContaPoupanca.sacar(42.0)

        assertEquals(true, sacarContaPoupanca.getStatus())
        assertEquals(138.0, sacarContaPoupanca.getSaldo())

    }

    @Test
    fun `sacar() - verifica o status da conta e saldo apos o saque de valor igual na ContaPoupanca`() {

        val sacarContaPoupanca = ContaPoupanca("Kelly Alves", "123456", "1234")

        sacarContaPoupanca.abrirConta()
        sacarContaPoupanca.taxaServico()

        sacarContaPoupanca.sacar(180.0)

        assertEquals(true, sacarContaPoupanca.getStatus())
        assertEquals(0.0, sacarContaPoupanca.getSaldo())

    }

    @Test
    fun `sacar() - verifica erro ao solicitar saque maior que o saldo atual na ContaPoupanca`() {

        val sacarContaPoupancaError = ContaPoupanca("Kelly Alves", "123456", "1234")

        sacarContaPoupancaError.abrirConta()
        sacarContaPoupancaError.taxaServico()

        assertEquals(true, sacarContaPoupancaError.getStatus())
        assertEquals("ERROR! Transação não autorizada! Verifique seu saldo.", sacarContaPoupancaError.sacar(250.0))

    }

    @Test
    fun `fecharConta() - verifica se o saldo da conta esta em 0 na ContaPoupanca`() {

        val fecharContaPoupanca = ContaPoupanca("Kelly Alves", "123456", "1234")

        fecharContaPoupanca.abrirConta()
        fecharContaPoupanca.taxaServico()

        fecharContaPoupanca.sacar(180.0)

        fecharContaPoupanca.fecharContar()

        assertEquals(0.0, fecharContaPoupanca.getSaldo())
        assertFalse(fecharContaPoupanca.getStatus())
        assertEquals("Conta encerrada com sucesso.", fecharContaPoupanca.fecharContar())
    }

    @Test
    fun `fecharConta() - verifica erro ao tentar encerrar a conta que contenha saldo positivo`() {

        val fecharContaPoupanca = ContaPoupanca("Kelly Alves", "123456", "1234")

        fecharContaPoupanca.setSaldo(88.0)

        fecharContaPoupanca.fecharContar()

        assertEquals(88.0, fecharContaPoupanca.getSaldo())
        assertEquals("A conta não pode ser encerrada. Verifique o saldo.", fecharContaPoupanca.fecharContar())
    }
}