package EstudoCollections
fun main() {
    val lists = listOf("One", "Two", "Tree", "Two")
    println(lists)
    println("Números de itens ${lists.count()}\n")

    val collections: MutableSet<String> = mutableSetOf("Blue", "Green", "Red", "Blue", "Green")
    collections.add("Pink")
    println(collections)
    println("Número de itens: ${collections.count()}")
    println("number" in collections)
    println()

    val readOnlyJuiceMenu = mapOf("maçã" to 100, "manga" to 150, "melão" to 200)
    println("O valor do suco de manga é: ${readOnlyJuiceMenu["manga"]}")
    println("Este mapa possui ${readOnlyJuiceMenu.count()} pares de valores-chave")
    println(readOnlyJuiceMenu.containsKey("manga"))
    println(readOnlyJuiceMenu.keys)
}