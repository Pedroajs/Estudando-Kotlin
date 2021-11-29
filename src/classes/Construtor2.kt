package classes

class Filme2(val name: String, val anoLancamento: Int, val genero: String, val diretor: String)

fun main() {
    val filme = Filme2(name = "O Iluminado", anoLancamento = 1983, genero = "Terror", diretor = "Stanley Kubrick" )

    println("${filme.name} foi dirigido por ${filme.diretor} em ${filme.anoLancamento} e é considerado um ${filme.genero}")

}