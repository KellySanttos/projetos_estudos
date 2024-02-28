package ExerciciosOperadores

fun main() {

    print("Digite a sua idade: ")
    var idade = readln().toInt()

    print("Digite a sua altura: ")
    var altura = readln().toDouble()

    print("Digite o seu sexo - Ex. M/m: ")
    var sexo = readln()

    if( (idade >= 18) && (altura >= 1.80) && (sexo == "M" || sexo == "m") ) {
        println("Atleta cadastrado com sucesso.")
    } else {
        println("Atleta não possui as condições desejadas.")
    }

}