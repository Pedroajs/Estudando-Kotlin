package classes

class Filme {
    val nome: String
    val anoLancamento: String
    val genero: String

    constructor(nome: String, anoLancamento: String, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("O Poderoso Chefão", "1972", "Drama")

    println("O filme ${filme.nome} foi lançado no ano de ${filme.anoLancamento} e é considerado um ${filme.genero}")
}