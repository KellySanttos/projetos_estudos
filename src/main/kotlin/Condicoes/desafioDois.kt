package Condicoes

fun main() {
    //Você tem um programa que conta fatias de pizza até formar uma pizza inteira com 8 fatias.
    // Refatore este programa de duas maneiras:
    var pizzaSlices = 0
    while ( pizzaSlices < 7 ) {
        pizzaSlices++ //6
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    println()


    var pizzaSlicesDois = 0
    pizzaSlicesDois++
    do {
        println("There's only $pizzaSlicesDois slice/s of pizza :(")
        pizzaSlicesDois++
    } while ( pizzaSlicesDois < 7 )
    println("There are $pizzaSlicesDois slices of pizza. Hooray! We have a whole pizza! :D")
}