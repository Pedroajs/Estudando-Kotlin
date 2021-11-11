package funcoes

fun potencia(base: Int = 2, expoente: Int = 1): Int{
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun main() {
    println(potencia(expoente = 10))
}