package fundamentos

// o param b esta rrecebendo um valor padrao (como o default em JS?)
fun soma(a: Int, b: Int = 1): Int{
    return a + b
}

fun main(args: Array<String>) {
    println(soma(10, 80))
    println(soma(11))
}