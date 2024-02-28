package ExerciciosOperadores

fun main() {

    print("Por favor, insira o valor desejado. (1000.0 - 100000.0): ")
    var valorEmprestismo = readln().toDouble()

    print("Por favor, insira a taxa de juros anual. (1 - 12): ")
    val taxa = readln().toDouble()

    print("Por favor, insira o prazo para a quitação do empréstimo. (1 - 10 anos): ")
    val prazo = readln().toInt()

    if( (valorEmprestismo >= 1000 && valorEmprestismo <= 100000) &&
        (taxa >= 1 && taxa <= 12) && (prazo >= 1 && prazo <= 10) ) {


        println("--------------------------------------------------------------------------")
        println("Detalhes da sua solicitação:\n" +
                "Valor solicitado: R$$valorEmprestismo\n" +
                "Taxa: $taxa%")

        if (prazo == 1) {
            println("Prazo: $prazo ano")

        } else {
            println("Prazo: $prazo anos")
        }

        val taxaJuros: Double = 1.0 + (taxa/100.0)
        val divida = valorEmprestismo * Math.pow(taxaJuros, prazo.toDouble()) //valor do empréstimo * (taxaJuros ^ prazo)

        println("Valor com juros: R$$divida")


    } else {
        println("--------------------------------------------------------------------------")
        println("Empréstimo negado.")}

}