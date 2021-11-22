package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("brastemp", 100)
    val g2 = Geladeira("brastemp", 100)

    val tv1 = Televisao("SempToshiba", 45)
    val tv2 = Televisao("SempToshiba", 45)
    println(g1 == g2)
    println(tv1 == tv2)
    println(tv1.toString())
    val tv3 = tv1.copy(polegadas = 50)
    println(tv3)

    // destructuring em data class
    val (marca, pol) = tv3
    println("$marca $pol")
}