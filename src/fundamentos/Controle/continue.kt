package fundamentos.Controle


// o continue pula o item do laço e continua a partir do seguinte
// nesse caso ele pulará do 5 para o 6 e continuará a execuçao do laço

fun main(args: Array<String>) {
    for(i in 1..10){
        if(i == 5) continue
        println("$i")
    }
}