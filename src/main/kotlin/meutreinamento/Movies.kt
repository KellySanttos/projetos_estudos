package meutreinamento

class Movies {

        var films: List<Film> = listOf(
            Film(
                id = 1,
                title = "Titanic",
                description = "Um artista pobre e uma jovem rica se conhecem e se apaixonam na fatídica viagem inaugural" +
                        " do Titanic em 1912. Embora esteja noiva do arrogante herdeiro de uma siderúrgica, a jovem desafia" +
                        " sua família e amigos em busca do verdadeiro amor.",
                author = "James Cameron",
                actors = "Leonardo DiCaprio, Kate Winslet, Billy Zane, Gloria Stuart",
                duration = 194
            ),

            Film(
                id = 2,
                title = "A origem",
                description = "Dom Cobb é um ladrão com a rara habilidade de roubar segredos do inconsciente, obtidos " +
                        "durante o estado de sono. Impedido de retornar para sua família, ele recebe a oportunidade de " +
                        "se redimir ao realizar uma tarefa aparentemente impossível: plantar uma ideia na mente do " +
                        "herdeiro de um império.",
                author = "Christopher Nolan",
                actors = "Leonardo DiCaprio, Marion Cotillard, Elliot Page",
                duration = 148
            ),

            Film(
                id = 3,
                title = "Tudo em todo o lugar ao mesmo tempo",
                description = "Uma ruptura interdimensional bagunça a realidade e uma inesperada heroína precisa usar " +
                        "seus novos poderes para lutar contra os perigos bizarros do multiverso.",
                author = "Daniel Scheinert e Daniel Kwan",
                actors = "Michelle Yeoh, Ke Huy Quan, Jamie Lee Curtis",
                duration = 139
            )
        )


        private var login: Boolean = true

        fun validateLogin(): Boolean {

            if (!login) {
                println("Login inválido")

                return false
            }

            println("Login Válido")
            return true
        }

        fun showFilmsList() {
            println("Apresentando lista de filmes:\n" +
                    "${films.map { x -> "Título: ${x.title} - ${x.id}" }}\n"
            )

        }

        fun choiceMovie(): Int {
            println("Escolha o id do filme que deseja obter informações:")
            return readln().toInt()
        }

        fun showFilmInfo(id: Int) {
            println("Filme escolhido:\n ")
            println(films.find { movie -> movie.id == id })
        }

        fun enableLogin() {
            login = true
        }

        fun disableLogin() {
            login = false
        }
}

//clean code
