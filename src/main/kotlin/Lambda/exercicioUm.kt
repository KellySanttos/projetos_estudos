package Lambda

//Você tem uma lista de ações suportadas por um serviço web, um prefixo comum para todas as
// solicitações e um ID de um recurso específico. Para solicitar uma ação titlesobre o recurso
// com ID: 5, é necessário criar a seguinte URL: https://example.com/book-info/5/title.
// Use uma expressão lambda para criar uma lista de URLs da lista de ações.

fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map{ "$prefix/$id/$it" }
    println(urls)
}