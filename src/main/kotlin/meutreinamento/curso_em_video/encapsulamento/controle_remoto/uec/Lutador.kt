package meutreinamento.curso_em_video.encapsulamento.controle_remoto.uec

class Lutador(no: String, na: String, id: Int, al: Double, pe: Double, vi: Int, de: Int, em: Int) {
    private var nome = no
    private var nacionalidade = na
    private var idade = id
    private var altura = al
    private var peso = pe
    private var categoria = ""
    private var vitorias = vi
    private var derrotas = de
    private var empates = em

    fun apresentar(): String {
        return """
            Lutador: ${getNome()}
            Nacionalidade: ${getNacionalidade()}
            Idade: ${getIdade()}
            Altura: ${getAltura()}m
            Peso: ${getPeso()}kg
            Vitórias: ${getVitorias()}
            Derrotas: ${getDerrotas()}
            Empates: ${getEmpates()}
        """.trimIndent()
    }

    fun status(): String {
        return """
            Lutador: ${getNome()}
            Categoria: ${setCategoria(getCategoria())}
            Vitórias: ${getVitorias()}
            Derrotas: ${getDerrotas()}
            Empates: ${getEmpates()}
        """.trimIndent()
    }

    fun ganharLuta() {
        setVitorias(getVitorias() + 1)
    }

    fun perderLuta() {
        setDerrotas(getDerrotas() + 1)
    }

    fun empatarLuta() {
        setEmpates(getEmpates() + 1)
    }

    fun getNome(): String {
        return this.nome
    }

    fun setNome(nome: String) {
        this.nome = nome
    }

    fun getNacionalidade(): String {
        return this.nacionalidade
    }

    fun setNacionalidade(nacionalidade: String) {
        this.nacionalidade = nacionalidade
    }

    fun getIdade(): Int {
        return this.idade
    }

    fun setIdade(idade: Int) {
        this.idade = idade
    }

    fun getAltura(): Double {
        return this.altura
    }

    fun setAltura(altura: Double) {
        this.altura = altura
    }

    fun getPeso(): Double {
        return this.peso
    }

    fun setPeso(peso: Double) {
        this.peso = peso
    }

    fun getCategoria(): String {
        return this.categoria
    }

    fun setCategoria(categoria: String): String {
        this.categoria = categoria

        return if (getPeso() > 52.8 && getPeso() <= 70.3) {
            "Leve"
        } else if (getPeso() <= 83.9) {
            "Médio"
        } else if (getPeso() <= 120.2) {
            "Pesado"
        } else {
            "Inválido"
        }
    }

    fun getVitorias(): Int {
        return this.vitorias
    }

    fun setVitorias(vitorias: Int) {
        this.vitorias = vitorias
    }

    fun getDerrotas(): Int {
        return this.derrotas
    }

    fun setDerrotas(derrotas: Int) {
        this.derrotas = derrotas
    }

    fun getEmpates(): Int {
        return this.empates
    }

    fun setEmpates(empates: Int) {
        this.empates = empates
    }
}