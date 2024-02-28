package Condicoes

fun main() {
    //Escreva um programa que simule o jogo Fizz buzz. Sua tarefa é imprimir números de 1 a 100 de forma incremental,
    // substituindo qualquer número divisível por três pela palavra "fizz" e qualquer número divisível por cinco pela palavra "buzz".
    // Qualquer número divisível por 3 e 5 deve ser substituído pela palavra “fizzbuzz”.

    var fizzBuzz = 1..100

    for (i in fizzBuzz) {

        println(
            when {
                i % 15 == 0 -> "fizzbuzz"
                i % 3 == 0 -> "fizz"
                i % 5 == 0 -> "buzz"
                else -> i.toString()
            }
        )
    }
}