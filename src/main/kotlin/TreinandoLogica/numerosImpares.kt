package TreinandoLogica

//encontrar números impares acima de 10, usar map com lambda e imprimir os números encontrados.
//usar a lógica dentro do lambda

fun main() {
    val listaNumberos = listOf(1,2,3,4,5,6,7,8,9,20,33,47,89,200)

    val impares = listaNumberos.map {
        val resto = it % 2
            if ( (it > 10) && (resto == 1) ) it else null
    }

    println(impares.joinToString())
}