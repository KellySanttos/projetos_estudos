package TreinandoLogica.list.excluirValorDuplicado

class BancoList {

    fun salvar(): List<Int> {

        val numbers: List<Int> = listOf(1,2,2,2,3,4,5,6,7,7)
        val newNumbers: MutableList<Int> = mutableListOf()

        numbers.forEach {
            if (it != 4 ) {
                newNumbers += it
            }
        }

        return newNumbers
    }
}