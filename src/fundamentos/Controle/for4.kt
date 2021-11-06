package fundamentos.Controle

fun main(args: Array<String>) {
    val alunos = arrayListOf("pedro", "ana", "joão")

    for((indice, aluno) in alunos.withIndex()){
        println("${indice}: ${aluno}")

    }

}