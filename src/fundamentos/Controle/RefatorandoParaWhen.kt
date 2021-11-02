package fundamentos.Controle

fun main(args: Array<String>) {
    val nota = 10

    when(nota){
        10, 9 -> print("fantástico")
        8, 7 -> print("parabéns")
        6, 5, 4 -> print("ainda tem como recuperar")
        in 0..3 -> print("te vejo n próximo ano")
        else -> print("inválido")
    }
}