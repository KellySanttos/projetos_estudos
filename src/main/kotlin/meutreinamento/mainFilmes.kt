package meutreinamento

fun main() {

    val films = Movies()

    films.enableLogin()

    if (!films.validateLogin()) {
        return
    }

    films.showFilmsList()

    val chosen = films.choiceMovie()
    films.showFilmInfo(chosen)

}