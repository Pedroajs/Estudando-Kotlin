package operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (marca, modelo) = Carro("Ford","Fusion")
    println("$marca $modelo")

    val (marido, mulher) = listOf("joao","maria")
    println("$marido $mulher")


    // pegando apenas o terceiro item de uma lista
    val(_, _, terceiroItem) = listOf("Primeiro Item", "Segundo Item", "Terceiro Item")
    println("$terceiroItem")
}