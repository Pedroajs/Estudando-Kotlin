package classes

class Cliente {
    var nome: String = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "Pedro"

    println("O cliente é ${cliente.nome}")
}