package Condicoes

fun main() {
    val ranges = 1..10

    for (i in ranges) {
    //println(ranges)
    }

    val cakes = listOf("Queijo", "Chocolate", "Morango")

    for (cake in cakes) {
        //println("Que delicia, é um bolo de $cake")
    }
    //------------------------------------------------------------

    var bolos = 0
    while (bolos < 3) {
        //println("Coma um bolo") //1
        bolos++
    }

    //------------------------------------------------------------

    var cakesEaten = 0 //valendo 2   0-1-2
    var cakesBaked = 0

    while (cakesEaten < 3) {
        //println("Coma um bolo")
        cakesEaten++
    }

    println()

    do {
        //println("Asse um bolo")
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    //------------------------------------------------------------


}