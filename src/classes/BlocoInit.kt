package classes

class Filme3(name:String, anoLancamento: Int, genero: String) {
    val name: String
    val anoLancamento: Int
    val genero: String

    init {
        this.name = name
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme3("Os Incríveis", 2003, "Aventura")
    println("${filme.name} é um filme Disney do genero ${filme.genero} lançado em ${filme.anoLancamento}")
}