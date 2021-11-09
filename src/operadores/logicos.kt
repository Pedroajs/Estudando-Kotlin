package operadores

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = false
    val executouTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2 // funcao infix para ou exclusivo

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    //operador unário
    if(!comprouSorvete) println("A saúde agradece")
}