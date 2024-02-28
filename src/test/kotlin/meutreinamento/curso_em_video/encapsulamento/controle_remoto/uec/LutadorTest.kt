package meutreinamento.curso_em_video.encapsulamento.controle_remoto.uec

import org.junit.jupiter.api.Test
import kotlin.test.*
import org.junit.jupiter.api.Assertions.*

class LutadorTest {

    @Test
    fun apresentar() {
        val lutadorUm = Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1)

        assertEquals(
            """
            Lutador: Pretty Boy
            Nacionalidade: França
            Idade: 31
            Altura: 1.75m
            Peso: 68.9kg
            Vitórias: 11
            Derrotas: 2
            Empates: 1
        """.trimIndent(), lutadorUm.apresentar()
        )
    }

    @Test
    fun status() {
        val lutador = Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1)

        lutador.ganharLuta()
        assertEquals(
            """
            Lutador: Pretty Boy
            Categoria: Leve
            Vitórias: 12
            Derrotas: 2
            Empates: 1
        """.trimIndent(), lutador.status()
        )
    }
}