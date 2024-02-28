package TreinandoLogica

fun main() {

    //guardar a lista de array e excluir os dois primeiros itens
    //precisa ser iterado para fazer o calculo

    val mensagem = listOf("0TAXINCL", "0DEBSTAT", "Multa", "Juros")
    val banco: MutableList<String> = mutableListOf()

    val tiposAceitos = listOf("0TAXINCL", "0DEBSTAT")

    mensagem.forEach { bla ->

        if(bla in tiposAceitos ) {

            banco += bla
            println(banco)

        }
    }

//    for(i in mensagem) {
//
//        if(i !in tiposNaoAceitos ) {
//
//            banco += i
//            println(banco)
//
//        }
//    }

}