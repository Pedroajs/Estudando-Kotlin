package fundamentos

fun main(args: Array<String>) {
    //Tipos númericos inteiros
    val num1: Byte = 127 // numero maximo suportado por um Byte
    val num2: Short = 32767 // num max suportado por um Short
    val num3: Int = 2_147_483_647 // num maximo suprotado por um Int
    val num4: Long = 9_223_372_036_854_775_807 //num maxz suportado porm um Long

    //Tipos númericos reais com ponto flutuante

    val num5: Float = 3.14F //qlqr numero real é um Double. Por isso o F no final
    val num6: Double = 3.1415

    //Tipo caractere
    val char: Char = '?' // Outros exemplos: '1', 'g', ' '...

    //Tipo boolean
    val boolean: Boolean = true // false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int) // por padrao qlqr literal inteiro é do tipo Int. Mesmo, como no caso, cabendo num Byte

    // Em kotlin tudo é um objeto
    println(10.dec())
}