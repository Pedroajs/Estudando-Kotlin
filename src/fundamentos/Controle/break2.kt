package fundamentos.Controle

fun main(args: Array<String>) {
    // dando um rotulo para o laço mais externo
    //  esse tipo de controle de fluxo nao é uma boa pratica
    externo@ for(i in 1..10){
            for(j in 1..10){
                if(i == 2 && j == 9) break@externo

                println("i:$i j:$j")
        }
    }
    println("fim")
}