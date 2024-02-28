package meutreinamento

data class Film(
    val id: Int,
    val title: String,
    val description: String,
    val author: String,
    val actors: String,
    val duration: Int

) {
    private fun convertDurationToHourAndMinute(): String {
        return "${duration / 60}h ${duration % 60}m"
    }

    override fun toString(): String {
        return """
            Título = $title
            Descrição = $description
            Autor = $author
            Atores = $actors
            Duração = ${convertDurationToHourAndMinute()}
        """.trimIndent()
    }
}
