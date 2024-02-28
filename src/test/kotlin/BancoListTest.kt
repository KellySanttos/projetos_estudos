import TreinandoLogica.list.excluirValorDuplicado.BancoList
import org.junit.jupiter.api.Test

class BancoListTest {

    @Test
    fun `salvar - valida a exclusividade dos numeros`() {

        val bancoList = BancoList()

        assert( bancoList.salvar() == mutableListOf(1,2,3,4,5,6,7) )
    }
}