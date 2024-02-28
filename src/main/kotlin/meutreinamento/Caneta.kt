package meutreinamento

open class Caneta() {
    var cor: String = ""
    var modelo: String = ""
    private var ponta: Float = 0f
    protected var carga: Int = 0
    private var tampada: Boolean = false

    fun rabiscar() {
        if (tampada) {
            println("ERRO! A caneta está tampada.")
        } else {
            println("Caneta rabiscando...")
        }
    }

    fun setTampada() {
        this.tampada = true
    }

    protected fun destampada() {
        this.tampada = false
    }

    fun status() {
        println("Caneta de cor: $cor")
        println("Modelo da caneta: $modelo")
        println("Ponta da caneta: $ponta")
        println("Carga da caneta: $carga")
        println("A caneta está tampada? $tampada\n")
    }
}
