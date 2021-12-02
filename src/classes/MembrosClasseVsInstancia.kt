package classes

class ItemPedido(val nome: String, var preco: Double) {
    // tudo dentro desse companion object é como se estivesse trabalhando com variaveis e metodos estaticos
    companion object{
        fun create(nome: String, preco: Double) = ItemPedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0
    }
    fun precoComDesconto(): Double{
        return preco - preco  * desconto
    }
}

fun main() {
    val item1 = ItemPedido.create("Fone Maneiro", 200.90)
    val item2 = ItemPedido("Webcam Show", 500.90)

    ItemPedido.desconto = 0.10
    println("o preco do ${item1.nome} com desconto é de ${item1.precoComDesconto()}")
    println("o preco da ${item2.nome} com desconto é de ${item2.precoComDesconto()}")

}