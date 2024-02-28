package Lambda

val uppercaseString: (String) -> String = {string -> string.uppercase()}

fun main() {
    //atribua um lambda a uma variável que você pode invocar mais tarde
    val upperCaseString = {string: String -> string.uppercase()}
    println( upperCaseString("olá") )

    val soma = {a: Int, b: Int -> a+b}
    println("\nResultado da soma: ${soma(1, 7)}" )

    println(uppercaseString("\nhello"))

}
