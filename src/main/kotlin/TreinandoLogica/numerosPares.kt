package TreinandoLogica

fun transformaPares(): (Int) -> Boolean {
    return { x -> x % 2 == 0 }
}

fun main() {
    val numeros = listOf(1,2,3,4,5,6,7,8,9,20,33,47,89,200)
    val pares = numeros.filter(transformaPares())

    println(pares)
}