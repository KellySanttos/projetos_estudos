package meutreinamento.curso_em_video.encapsulamento.controle_remoto

interface Controlador {
    fun ligar()
    fun desligar()
    fun diminuirVolume()
    fun aumentarVolume()
    fun abrirMenu()
    fun fecharMenu()
    fun mutar()
    fun desmutar()
    fun play()
    fun pause()
}