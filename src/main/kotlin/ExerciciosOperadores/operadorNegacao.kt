package ExerciciosOperadores

fun main() {

    print("Digite sua idade: ")
    var idade = readln().toInt()

    print("Digite sua altura: ")
    var altura = readln().toDouble()

    print("Digite seu sexo - (ex: M/m): ")
    var sexo = readln()

    val condicao_idade = idade >= 18 && idade <= 24
    val condicao_altura = altura >= 1.80
    val condicao_sexo = sexo == "M" || sexo == "m"

    if(! (condicao_idade) ) {
        println("O atleta não possui a idade requisitada")
    } else {
        println("TESTE")
    }

    if(! (condicao_altura) ) {
        println("O atleta não possui a altura requisitada")
    }

    if(! (condicao_sexo) ) {
        println("Atleta não é do sexo masculino")
    }

    println()

    if(! (condicao_idade && condicao_altura && condicao_sexo) ) {
        println("Atleta não cadastrado.")
    }

    if(condicao_idade && condicao_altura && condicao_sexo) {
        println("Atleta cadastrado com sucesso.")
    }
}