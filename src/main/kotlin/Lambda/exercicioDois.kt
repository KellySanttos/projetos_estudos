package Lambda

import java.util.Scanner

//Escreva uma função que receba um Intvalor e uma ação (uma função com tipo () -> Unit) que então
//repita a ação um determinado número de vezes. Em seguida, use esta função para imprimir
//“Hello” 5 vezes.

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

fun main() {
    repeatN(5) {
        println("Hello")
    }
}