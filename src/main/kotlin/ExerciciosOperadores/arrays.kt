package ExerciciosOperadores

fun main() {

    var numerosImpares: Array<Int> = arrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21)

    println(numerosImpares[3])

    var tam = numerosImpares.size
    println("Tamanho do array: $tam")

    var ultimo_elemento = tam -2
    println("-----------------------------")
    println("Tamanho do array -2: $ultimo_elemento")
    println("Último elemento: ${numerosImpares[ultimo_elemento]}") //pq 21? - deu a volta no array?

    //imprimir número por número
    var primeiro_elemento = 0
    println("-----------------------------\n" +
            "Imprimindo número por número\n" +
            "${numerosImpares[primeiro_elemento]}")
    primeiro_elemento++
    println(numerosImpares[primeiro_elemento])

    //substituição de valores
    println("---------------------------------")
    println("Substituindo o número >> ${numerosImpares[ultimo_elemento]} por 2")
    numerosImpares[ultimo_elemento] = 2
    println("Novo valor: ${numerosImpares[ultimo_elemento]}")

    //adicionando um novo elemento ao array
    println("---------------------------------")
    numerosImpares += 23
    ultimo_elemento = numerosImpares.size -1 //tamanho 12 -1 = 11
    println("Último elemento atualizado: ${numerosImpares[ultimo_elemento]}")

    //var numerosImpares: Array<Int> = arrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23)

}