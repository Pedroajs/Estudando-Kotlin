package operadores

fun main() {
    var num1: Int = 1
    var num2: Int = 2

    num1++
    println(num1)
    --num1 // op prefixado
    println(num1)

    //incremento e decremento
    println(++num1 == num2--)

    /*
    * no caso acima o operador prefixado tem precedencia ao operador de comparacao
    * no caso do pós fixado o operador de igualdade tem precedencia a ele
    *
    * o num1 vai ser incrementado antes da comparacao, e o num2 vai ser decrementado depois da comparacao
    *
    * ESSE É APENAS UM CÓDIGO DE EXEMPLO. NÃO É UMA BOA PRATICA
    * */

}