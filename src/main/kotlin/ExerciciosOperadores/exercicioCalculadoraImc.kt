package ExerciciosOperadores

fun main() {

    print("Por favor, insira o seu peso: ")
    val peso = readln().toDouble()

    print("Por favor, insira a sua altura: ")
    val altura = readln().toDouble()

    val imc = peso / (altura * altura)

    if ((altura == 0.0) || (peso == 0.0)) {
        println("\nERROR! Valor não pode ser igual a 0.")
        return
    }

    when (imc) {
        in 0.0..18.4 -> println( //range
            "\nMassa corporal: $imc" +
                    "\nAbaixo do peso"
        )

        in 18.5..24.9 -> println(
            "\nMassa corporal: $imc" +
                    "\nPeso ideal"
        )

        in 25.0..29.9 -> println("\nMassa corporal: $imc" +
                "\nAcima do peso")

        in 30.0..34.9 -> println("\nMassa corporal: $imc" +
                "\nObesidade grau I")

        in 35.0..39.9 -> println("\nMassa corporal: $imc" +
                "\nObesidade grau II")

        else -> println("\nMassa corporal: $imc" +
                "\nObesidade grau III")

    }
}