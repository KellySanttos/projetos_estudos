package EstudoCollections

import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("21.99"),
        BigDecimal("31.99"), BigDecimal("20.99"), BigDecimal("3.99"),
        BigDecimal("5.99"),
        )

    val precoProdutos = somarPrecos(precoDosProdutos)
    println("Preço total dos produtos: $precoProdutos")

}

fun somarPrecos(produtos: Array<BigDecimal>): BigDecimal {
    var precoTotal = BigDecimal.ZERO

    for (preco in produtos) {
        precoTotal += preco
    }

    return precoTotal
}
