package fundamentos

fun main(args: Array<String>) {
    val opcional:String? = null
    val obrigatorio: String = opcional ?: "valor padrão"
    println(obrigatorio)

    /*
    * com o elvis operator é possivel atribuir um valor padrao a uma variavel que não se
    * tenha certeza se tem valor. Evitando erros
    *
    *
    * */
}