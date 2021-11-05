package fundamentos.Controle

fun main(args: Array<String>) {
    var opcao: Int = 0

    while(opcao != -1){
        val line = readLine() ?:"0"
        opcao = line.toIntOrNull()?:0

        println("voce escolheu a opcao ${opcao}")
    }
    print("até a próxima")
}