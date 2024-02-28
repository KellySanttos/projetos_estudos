package meutreinamento


fun main() {
    val age = readln().toInt()
    val authorized = "Acesso autorizado"
    val denied = "Acesso negado"

    if( age >= 18 ) {
        println(authorized)

        val primeiroNumero = readln().toDouble()
        val segundoNumero = readln().toDouble()

         println(primeiroNumero * segundoNumero)
    } else {
        println(denied)
    }
}