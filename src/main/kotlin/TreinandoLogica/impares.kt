package TreinandoLogica

fun main() {
    val numeros = listOf(1,2,3,4,5,6,7,8,9,20,33,47,89,200)

    val transformarNumero = TransformarNumero()

    transformarNumero.setMaior(10)

    val numerosImpares = transformarNumero.tranformaImpares(numeros)
    println(numerosImpares)
}

class TransformarNumero() {

    private var maior: Int = 0

    fun setMaior(novoMaior: Int) {
        maior = novoMaior
    }

    fun tranformaImpares(numbers: List<Int>): List<Int> {
        return numbers.filter { x -> x % 2 == 1 && x > maior }
    }

    fun transformaPares(numbers: List<Int>): List<Int> {
        return numbers.filter { x -> x % 2 == 0 }
    }
}