package funcoes
// As duas funções retornam Unit (void em JAVA), mas apenas na segunda declaramos explicitamente seu retorno
// Passando Unit como retorno na declaração da função, não é necessário usar o return
// Também é possível usar o return, bem como retornar Unit explicitamente. Como visto na terceira e quarta funções
fun imprimeMaior(a: Int, b: Int){
    println(Math.max(a, b))
}


fun imprimeMaior2(a: Int,b: Int): Unit{
    println(Math.max(a, b))
}

fun imprimeMaior3(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return
}

fun imprimeMaior4(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return Unit
}
fun main() {
    println(imprimeMaior2(2, 3).run { 2 > 3 }.run { println("Resultado = $this") })
}