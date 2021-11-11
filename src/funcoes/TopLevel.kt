package funcoes

fun min(x: Int, y: Int): Int{
    return if(x < y) x else y
}

fun main(args: Array<String>) {
    println("o menor valor é ${min(3, 4)}")
}