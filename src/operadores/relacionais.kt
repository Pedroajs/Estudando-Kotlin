package operadores
import java.util.*

fun main() {
    println("banana" === "banana")
    println(3!==2)
    println(3<2)
    println(3>2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    // igualdade referencial: verifica se as variaveis apontam para o mesmo endereço de memória
    println("Resultado com '==='  ${d1 === d2}")

    // igualdade estrutural: verifica se os conteúdos dos objetos são iguais
    println("Resultado com '==' ${d1 == d2}")
}