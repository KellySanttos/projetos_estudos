package ExerciciosOperadores

fun main() {

    val range = 0..10 step 2

    for(a in range) {

        if (a == 2) {
            println("DOIS")
        } else {
            println(a)
        }
    }

    println("\n--------------\n")

    var array = arrayOf("a", "b", "c", 0, 2, 5, 6, 9, 12)

    for (i in array){
        println(i)
    }
}