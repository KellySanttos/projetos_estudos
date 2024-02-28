package meutreinamento.curso_em_video.encapsulamento.controle_remoto

class ControleRemoto : Controlador {
    private var tocando = false
    private var ligado = false
    private var volume = 20

    override fun ligar() {
        setLigado(true)
    }

    override fun desligar() {
        setLigado(false)
    }

    override fun diminuirVolume() {
        if (getLigado()) {
            setVolume(getVolume() - 1)
        }
    }

    override fun aumentarVolume() {
        if (getLigado()) {
            setVolume(getVolume() + 1)
        }
    }

    override fun abrirMenu() {

        println(
            """
            ---- MENU ----
            
            Está ligado? ${getLigado()}
            Está tocando? ${getTocando()}
            Volume: ${getVolume()}
        """.trimIndent()
        )

        var iterator = 10
        while (iterator <= getVolume()) {
            iterator += 10
            print("|")
        }
    }

    override fun fecharMenu() {
        println("Menu fechado")
    }

    override fun mutar() {
        if (getLigado() && getVolume() > 0) {
            setVolume(0)
        }
    }

    override fun desmutar() {
        if (getLigado() && getVolume() == 0) {
            setVolume(20)
        }
    }

    override fun play() {
        if (getLigado() && !getTocando()) {
            setTocando(true)
        }
    }

    override fun pause() {
        if (getLigado() && getTocando()) {
            setTocando(false)
        }
    }

    private fun getTocando(): Boolean {
        return this.tocando
    }

    private fun setTocando(tocando: Boolean) {
        this.tocando = tocando
    }

    private fun getLigado(): Boolean {
        return this.ligado
    }

    private fun setLigado(ligado: Boolean) {
        this.ligado = ligado
    }

    private fun getVolume(): Int {
        return this.volume
    }

    private fun setVolume(volume: Int) {
        this.volume = volume
    }
}