package meutreinamento

class Films {

    var films: List<Film> = listOf(
        Film(id = 1, title = "Titanic",
        description = " Um artista pobre e uma jovem rica se conhecem e se apaixonam na fatídica viagem inaugural" +
                " do Titanic em 1912. Embora esteja noiva do arrogante herdeiro de uma siderúrgica, a jovem desafia" +
                " sua família e amigos em busca do verdadeiro amor.",
        author = " James Cameron",
        actors = " Leonardo DiCaprio, Kate Winslet, Billy Zane, Gloria Stuart",
        duration = 194),

        Film(id = 2, title = " A origem",
        description = " Dom Cobb é um ladrão com a rara habilidade de roubar segredos do inconsciente, obtidos durante" +
                " o estado de sono. Impedido de retornar para sua família, ele recebe a oportunidade de se redimir ao" +
                " realizar uma tarefa aparentemente impossível: plantar uma ideia na mente do herdeiro de um império.",
        author = " Christopher Nolan",
        actors = " Leonardo DiCaprio, Marion Cotillard, Elliot Page",
        duration = 148),

        Film(id = 3, title = " Tudo em todo o lugar ao mesmo tempo",
        description = " Uma ruptura interdimensional bagunça a realidade e uma inesperada heroína precisa usar seus " +
                " novos poderes para lutar contra os perigos bizarros do multiverso.",
        author = " Daniel Scheinert e Daniel Kwan",
        actors = "Michelle Yeoh, Ke Huy Quan, Jamie Lee Curtis",
        duration = 139))


    private var login: Boolean = true

    fun validated(): List<Film> {
         if (login) {
            println("Login realizado com sucesso!\n\n" +
                    "Apresentando lista de filmes:\n" +
                    "${films.map { x -> "Título: ${x.title} - ${x.id}" }}\n")
        } else {
            println("Login inválido")
        }

        val chosen = choiceMovie() //escolhido - escolhaFilme
        infoFilmes(chosen)
         return listOf()
    }

    private fun choiceMovie(): Int{
        println("Escolha o filme que deseja obter informações. (1, 2, 3)")
        return readln().toInt()
    }

    private fun infoFilmes(id: Int) {
         println( films.find { x -> x.id == id } )
    }

    fun loginValido() {
        login = true
    }

    fun loginInvalido() {
        login = false
    }
}