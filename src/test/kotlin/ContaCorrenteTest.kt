//import meutreinamento.banco.ContaCorrente
//import org.junit.jupiter.api.Test
//import kotlin.test.*
//
//class ContaCorrenteTest {
//
//    @Test
//    fun `abrirConta() valida a abertura da conta corrente`() {
//        val abrirContaCorrente = ContaCorrente()
//
//        abrirContaCorrente.setTitular("Cassiano Faria")
//        abrirContaCorrente.abrirConta()
//
//        assertEquals(true, abrirContaCorrente.getStatus())
//        assertEquals(100.0, abrirContaCorrente.getSaldo())
//        assertEquals("Cassiano Faria", abrirContaCorrente.getTitular())
//    }
//
//    @Test
//    fun `taxaServico() - valida o desconto mensal da taxa de servico Corrente`() {
//        val taxaServicoContaCorrente = ContaCorrente()
//
//        taxaServicoContaCorrente.abrirConta()
//        taxaServicoContaCorrente.taxaServico()
//
//        assertEquals(88.0, taxaServicoContaCorrente.getSaldo())
//    }
//
//    @Test
//    fun `depositar() - verifica o status da conta e saldo apos deposito na ContaCorrente`() {
//
//        val depositarContaCorrente = ContaCorrente()
//
//        depositarContaCorrente.setTitular("Cassiano Faria")
//
//        depositarContaCorrente.abrirConta()
//        depositarContaCorrente.taxaServico()
//
//        depositarContaCorrente.depositar(20.0)
//
//        assertEquals(true, depositarContaCorrente.getStatus())
//        assertEquals(108.0, depositarContaCorrente.getSaldo())
//
//    }
//
//    @Test
//    fun `depositar() - verifica erro no status da conta`() {
//
//        val depositarContaCorrente = ContaCorrente()
//
//        depositarContaCorrente.setStatus(false)
//
//        assertFalse(depositarContaCorrente.getStatus())
//        assert(depositarContaCorrente.depositar(40.0) == "Error! A conta informada não existe")
//
//    }
//
//    @Test
//    fun `sacar() - verifica o status da conta e saldo apos o saque na ContaCorrente`() {
//
//        val sacarContaCorrente = ContaCorrente()
//
//        sacarContaCorrente.abrirConta()
//        sacarContaCorrente.taxaServico()
//
//        sacarContaCorrente.sacar(35.0)
//
//        assertEquals(true, sacarContaCorrente.getStatus())
//        assertEquals(53.0, sacarContaCorrente.getSaldo())
//
//    }
//
//    @Test
//    fun `sacar() - verifica o status da conta e saldo apos o saque de valor igual na ContaCorrente`() {
//
//        val sacarContaCorrente = ContaCorrente()
//
//        sacarContaCorrente.abrirConta()
//        sacarContaCorrente.taxaServico()
//
//        sacarContaCorrente.sacar(88.0)
//
//        assertEquals(true, sacarContaCorrente.getStatus())
//        assertEquals(0.0, sacarContaCorrente.getSaldo())
//
//    }
//
//    @Test
//    fun `sacar() - verifica erro ao solicitar saque maior que o saldo atual na ContaConrrente`() {
//
//        val sacarContaCorrenteError = ContaCorrente()
//
//        sacarContaCorrenteError.abrirConta()
//        sacarContaCorrenteError.taxaServico()
//
//        assertEquals(true, sacarContaCorrenteError.getStatus())
//        assertEquals("ERROR! Transação não autorizada! Verifique seu saldo.", sacarContaCorrenteError.sacar(250.0))
//
//    }
//
//    @Test
//    fun `fecharConta() - verifica se o saldo da conta esta em 0 na ContaCorrente`() {
//
//        val fecharContaCorrente = ContaCorrente()
//
//        fecharContaCorrente.abrirConta()
//        fecharContaCorrente.taxaServico()
//
//        fecharContaCorrente.sacar(88.0)
//
//        fecharContaCorrente.fecharContar()
//
//        assertEquals(0.0, fecharContaCorrente.getSaldo())
//        assertFalse(fecharContaCorrente.getStatus())
//        assertEquals("Conta encerrada com sucesso.", fecharContaCorrente.fecharContar())
//    }
//
//    @Test
//    fun `fecharConta() - verifica erro ao tentar encerrar a conta que contenha saldo positivo`() {
//
//        val fecharContaCorrente = ContaCorrente()
//
//        fecharContaCorrente.setSaldo(88.0)
//
//        fecharContaCorrente.fecharContar()
//
//        assertEquals(88.0, fecharContaCorrente.getSaldo())
//        assertEquals("A conta não pode ser encerrada. Verifique o saldo.", fecharContaCorrente.fecharContar())
//    }
//}