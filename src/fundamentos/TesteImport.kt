package fundamentos

// importando a funcao e mudando seu nome

import fundamentos.PacoteA.simplesFuncao as funcaoSimples
import fundamentos.PacoteA.Coisa
import fundamentos.PacoteA.FaceMoeda.CARA

//importa tudo do pacoteB
import fundamentos.PacoteB.*

fun main(args: Array<String>) {
    // todas as funcoes nativas são importadas de kotlin.io
    kotlin.io.println(funcaoSimples("ok"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    print("${soma(2, 3)} ${subtracao(2, 3)}")
}