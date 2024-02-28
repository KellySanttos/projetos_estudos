package Lambda

//passar uma expressão lambda como parâmetro para outra função
fun main() {
    val numbers = listOf(1, 2, -3, 4, -5, 6, -7)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }

    println("Números originais: $numbers")
    println("Numeros positivos: $positives")
    println("Números negativos: $negatives")

    println("----------------------------------")

    val numbersOTwo = listOf(1, 3, -5, -6, 7, 8, -9)
    val doubled = numbersOTwo.map { x -> x * 2 }
    val tripled = numbersOTwo.map { x -> x * 3 }

    println("Números originais: $numbersOTwo")
    println("Números dobrados: $doubled")
    println("Números triplicados: $tripled")
}