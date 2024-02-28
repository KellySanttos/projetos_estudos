package TreinandoLogica

fun main() {
    //somar todos os pares menores que 3000
    val listaRecebida = listOf(1,2,4,6,8,9,30,67,99,200,76,77,2467,2498)
    //println(listaRecebida.joinToString())
    var soma = 0

    for (i in listaRecebida) {
        val resto = i % 2

        if( (i < 200) && (resto == 0) ) { //&& (i != 2498)

            soma += i
        }
    }
    println(soma)
}