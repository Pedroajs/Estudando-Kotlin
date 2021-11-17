package classes

class Calculadora {
    private var resultado: Int = 0

    fun somar(vararg valores: Int): Calculadora{
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(vararg valores: Int): Calculadora{
        valores.forEach { resultado *= it }
        return this
    }

    fun subtrair(vararg valores: Int): Calculadora{
        valores.forEach { resultado -= it }
        return this
    }

    fun dividir(valor: Int):Calculadora{
        resultado /= valor
        return this
    }

    fun tirarResto(valor:Int): Calculadora{
        resultado %= valor
        return this
    }

    fun limpar(): Calculadora{
        resultado = 0
        return this
    }

    fun print(): Calculadora{
        println(resultado)
        return this
    }

    fun obterResultado(): Int{
        return resultado
    }
}

fun main() {
    val calculadora = Calculadora()

    calculadora.somar(1,2,3,).multiplicar(3).print()
    calculadora.dividir(2).print()
}