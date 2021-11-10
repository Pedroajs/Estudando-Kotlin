package fundamentos

fun main(args: Array<String>) {
    val valor: Any = 123

    val result = if(valor is String) "É uma String" else "Não é uma String"

    println(result)
}