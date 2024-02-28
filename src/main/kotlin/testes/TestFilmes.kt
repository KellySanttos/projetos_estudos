package testes
import meutreinamento.Films
import org.junit.jupiter.api.Test

class TestFilmes {

    @Test
    fun `valida titulo - id de Titanic`() {

        val films = Films()
        val result = films.validated()

        assert(
            result == listOf("Login realizado com sucesso!\n\n Apresentando lista de filmes:\n",
            "Título: Titanic - 1",
            "Título: A Origem - 2",
            "Título: Tudo em todo o lugar ao mesmo tempo - 3"))
    }
}