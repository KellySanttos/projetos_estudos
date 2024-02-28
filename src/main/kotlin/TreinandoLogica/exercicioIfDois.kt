package TreinandoLogica

fun main() {
    val listaRecebida = listOf(1,2,4,6,8,9,30,67,99,200,76,77,2467,2498)
    val soma: MutableList<Int> = mutableListOf()

    for (i in listaRecebida) {
        val resto = i % 2

        if( (i < 200) && (resto == 0) ){
            soma += i
        }
    }

    println("A soma dos valores são: ${soma.sum()}")
    println(soma)
}