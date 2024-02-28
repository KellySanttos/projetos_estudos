package meutreinamento.curso_em_video.encapsulamento.controle_remoto.uec

abstract class Luta {
    private lateinit var desafiante: Lutador
    private lateinit var desafiador: Lutador
    private var rounds: Int = 0
    private var aprovada: Boolean = false

    fun marcarLuta() {

    }

    fun lutar() {

    }

    fun getDesafiante(): Lutador {
        return this.desafiante
    }

    fun setDesafiante(desafiante: Lutador) {
        this.desafiante = desafiante
    }

    fun getDesafiadoor(): Lutador {
        return this.desafiador
    }

    fun setDesafiadoor(desafiador: Lutador) {
        this.desafiador = desafiador
    }

    fun getRounds(): Int {
        return this.rounds
    }

    fun setRounds(rounds: Int) {
        this.rounds = rounds
    }

    fun getAprovada(): Boolean {
        return this.aprovada
    }

    fun setAprovada(aprovada: Boolean) {
        this.aprovada = aprovada
    }
}