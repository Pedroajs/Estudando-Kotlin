package funcoes

// infix é uma função que está entre dois operando

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco


fun main(args: Array<String>) {
    val produto1 = Produto("Camiseta", 99.90)
    val produto2 = Produto(preco = 29.99, nome = "Bermuda")
    val produto3 = Produto("TV", 3000.0)

    // duas maneiras de usar a funcao criada:
    // A primeira, abaixo, como infix. E a segunda usando o dot notation como qlqr outro metodo de uma classe

    println(produto1 maisCaroQue  produto2)
    println(produto1.maisCaroQue(produto3))
}