package meutreinamento

class CanetaDois() {

    var cor: String = ""
    var modelo: String = ""
    var ponta: Float = 0.0f
    var tampada: Boolean = false

    init {
        this.cor = "azul"
    }

    fun setModeloo(model: String) {
        this.modelo = model
    }

    fun setCoor(color: String) {
        this.cor = color
    }

    fun setPontaa(point: Float) {
        this.ponta = point
    }

    fun tampar() {
        this.tampada = true
    }

    fun CanetaDois() {
        this.cor = "Verde"
        this.tampar()
    }

    fun construtor(c: String, m: String, p: Float) {
        setCoor(c) // amarelo
        setModeloo(m) // Bic
        setPontaa(p) // 0.7f
        tampar()
    }

    fun status() {
        println("Informações sobre a caneta: \nCor -> ${cor}, \nModelo -> ${modelo}, \nPonta -> ${ponta} \nA caneta está tampada? ${tampada}")
    }
}