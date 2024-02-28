package EstudoCollections

fun main() {
    //List é uma coleção de itens ordenados, aceita valores repetidos e é imutável
    val frutas = listOf("Manga", "Uva", "Acerola", "Goiaba", "Banana")
    val banco: MutableList<String> = mutableListOf()

    for(a in frutas){
       if (a != "Uva") {
           banco += a
       }
    }
    println(banco)
}