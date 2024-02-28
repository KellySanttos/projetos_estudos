package TreinandoLogica

fun main() {
    val numeros = listOf(1,2,3,4,5,6,7,8,9,20,33,47,89,200)

    val transformaNumero = TransformarNumeros()

    transformaNumero.setMaior(0)

    if (transformaNumero.getMaior() < 10) return

    val numerosImpares = transformaNumero.tranformaImpares(numeros)
    println(numerosImpares)
}

class TransformarNumeros() {

    private var maior: Int = 0 //10

    fun setMaior(novoMaior: Int) {

        if (novoMaior >= 10) {
            println("Números ímpares acima de 10:")
            maior = novoMaior

        } else {
            println("Erro")
        }
    }

    fun getMaior() = this.maior

    private fun transformaImparesPrivado(): (Int) -> Boolean {
        return { x -> x % 2 == 1 && x > maior }
    }

    fun tranformaImpares(numbers: List<Int>): List<Int> {
        return numbers.filter(transformaImparesPrivado())
    }

    fun transformaPares(numbers: List<Int>): List<Int> {
        return numbers.filter { x -> x % 2 == 0 }
    }

    /*fun setMaior(maior: Int) {
        this.maior = maior
    }

    fun getMaior(): Int {
        return maior
    }*/
}

//encapsulamento
//