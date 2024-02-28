package meutreinamento

class Pessoa(var nome: String, val cpf: String, var telefone: Int) {
    fun dados() {
        println("Meus dados: Nome - $nome, cpf - $cpf, telefone - $telefone")
    }
}

fun main() {
    val pessoa = Pessoa("Kelly", "1234567890", 987654321)
    val outraPessoa = Pessoa("Maria", "0987654321", 123456789)

    pessoa.dados()
    outraPessoa.dados()

}