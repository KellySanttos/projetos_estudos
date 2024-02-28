package ExerciciosOperadores

fun main() {

    val idade = 14

    var idadeUm = idade > 18
    var idadeDois = idade >= 15 && idade <= 17
    var idadeTres = idade <= 14

    if(idadeUm) {
        println("Pessoa Autorizada!")
    }

    if(idadeDois) {
        println("Necessita da permissão do responsável.")
    }

    if(idadeTres) {
        println("Não Autorizado")
    }
}