package funcoes

inline fun transacao(funcao: () -> Unit){
    println("Abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando transação")
    }
}

fun main() {
    transacao {
        println("Executando sql 1...")
    }
}