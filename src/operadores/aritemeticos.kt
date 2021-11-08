package operadores

fun main() {
    val (v1, v2 ,v3, v4) = listOf(3, 5, 1, 15)

    val soma = v1+v2+v3+v4
    val subtracao = v1-v2-v3-v4
    val divisao = v1/v2/v3/v4
    val multiplicacao = v1*v2*v3*v4
    val modulo = v4 % 2

    println("Soma $soma subtracao $subtracao divisao $divisao multiplicacao $multiplicacao modulo $modulo")
}