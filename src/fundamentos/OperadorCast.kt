package fundamentos

fun imprimirConceito(nota: Any){
    // usando a notaçao ? garante que o resultado nao de numa runtime, mas em null
    // no exemplo abaixo, com o array de notas Double, cairá no else
    when(nota as? Int){
         10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("F")
        else -> println("Nota inválida")
    }
}


fun main(args: Array<String>) {
    val notasArray = listOf<Double>(1.2, 3.4, 9.5, 10.0)

    for(nota in notasArray){
        imprimirConceito(nota.toInt())
    }
}

