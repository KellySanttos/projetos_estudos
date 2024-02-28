package meutreinamento

class Main {

    fun main() {

        val caneta = Caneta()
        caneta.cor = "Preto"
        caneta.modelo = "Bic"
        caneta.setTampada()

        caneta.status()
    }
}