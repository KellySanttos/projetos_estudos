package Condicoes

fun main() {
//    val d: Int
    //val check = true

    val a = 1
    val b = 2

    println( if (a > b) a else b )

//    val w = "Hello"
//    val check = when(w) {
//        "Hel" -> println("Saudação")
//        "Hell" -> println("Saudações")
//        "1" -> println("One")
//        else -> print("Desconhecido")
//    }

    val saudacao = "Hello"
    val saida = when(saudacao) {
        "hello" -> "Saudação"
        "1" -> "Number"
        else -> "Desconhecido"
    }
   // println(saida)

    val temperatura = 18

    val check = when {
        temperatura < 0 -> "muito frio"
        temperatura < 10 -> "frio"
        temperatura < 20 -> "esquentando"
        else -> "Quente"
    }
    println(check)
}