package classes

class Produto(var nome: String,var preco: Double, var desconto: Double, var ativo: Boolean) {
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)

}

fun main() {
    val produto1 = Produto("Ipad", 2349.90,0.20, true)
    val produto2 = Produto("galaxy S21", 3000.00, 0.12, false)
    println(produto1.precoComDesconto)
    println("${produto2.nome}\n\t De: ${produto2.preco} Por: ${produto2.precoComDesconto}")

    if(produto2.inativo){
        produto2.preco = 0.0
        println("Depois de inativo: ${produto2.precoComDesconto}")
    }
}