package funcoes

class Operacoes {
    fun somar(a: Int, b:Int): Int{
        return a + b
    }
}

fun somar(a: Int, b: Int): Int{
    return a + b
}

// aqui declaramos uma funcao e passamos pra ela como param outra funcao, definindo seus parametros e seu retorno

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int{
    return funcao(a, b)
}

// passando a referencia de uma função para outra
fun main() {
    println(calc(2, 3, Operacoes()::somar))
    println(calc(2,4, ::somar))
}