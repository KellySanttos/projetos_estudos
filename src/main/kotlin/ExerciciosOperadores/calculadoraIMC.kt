package ExerciciosOperadores

fun main() {

    print("Por favor, insira o seu peso: ")
    val peso = readln().toDouble()

    print("Por favor, insira a sua altura: ")
    val altura = readln().toDouble()


    if( (altura == 0.0) || (peso == 0.0) ){
        println("\nERROR! Valor não pode ser igual a 0.")
    } else {

        val imc = peso / (altura * altura) //infinity

        if( imc < 18.5 ) {
            println("\nMassa corporal: $imc" +
                    "\nAbaixo do peso")
        }

        if( (imc >= 18.5) && (imc <= 24.9) ) {
            println("\nMassa corporal: $imc" +
                    "\nPeso ideal")
        }

        if( (imc >= 25.0) && (imc <= 29.9) ) {
            println("\nMassa corporal: $imc" +
                    "\nAcima do peso")
        }

        if( (imc >= 30.0) && (imc <= 34.9) ) {
            println("\nMassa corporal: $imc" +
                    "\nObesidade grau I")
        }

        if( (imc >= 35.0) && (imc <= 39.9) ) {
            println("\nMassa corporal: $imc" +
                    "\nObesidade grau II")
        }

        if( (imc >= 40.0) ) {
            println("\nMassa corporal: $imc" +
                    "\nObesidade grau III")
        }
    }

}