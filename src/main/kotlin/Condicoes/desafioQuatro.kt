package Condicoes

fun main() {

    //Você tem uma lista de palavras. Use for e if para imprimir apenas as palavras que começam com a letra l.
    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for (i in words) {

        if (i.startsWith("l")) {
            print("Palavras começadas com l: $i")
        }

        //outra forma de se fazer
        when {
            //i.startsWith("l") -> println(i)
        }
    }
}