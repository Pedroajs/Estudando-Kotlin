package fundamentos.Controle

fun main(args: Array<String>) {
    val nota: Double = 6.0
    val resultado: String = if(nota >= 7) "APROVADO" else "REPROVADO"

    print(resultado)
}