package Classes

data class User(val name: String, val id: String)

fun main() {
    val user = User("Kelly", "2")
    val secondUser = User("Kelly", "2")
    val thirdUser = User("Gleice", "1")

    //comparar se as instancias são iguais
    println("Usuário = Segundo usuário: ${user == secondUser}")
    println("Segundo usuário = terceiro usuário: ${secondUser == thirdUser}\n")

    //criar cópia de instâncias
    println(user.copy())
    println(user.copy("Gleice"))
    println(user.copy(id = "3"))
}

