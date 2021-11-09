package fundamentos.Controle

fun obterResultado(nota: Double) : String = if(nota >= 7.0) "APROVADO" else "REPROVADO"

// numa função sem bloco existe implicitamente o return

fun main(args: Array<String>) {
    val nota: Double = 5.0
    print(obterResultado(nota))
}