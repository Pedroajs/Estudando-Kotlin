package funcoes

/**
 * Usando a palavra reservada vararg podemos varios argumentos para uma função
 */

fun ordenar(vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for(n in ordenar(38, 3, 456, 8, 51, 1, 88, 73)){
        println("$n")
    }
}