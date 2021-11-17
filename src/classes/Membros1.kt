package classes


class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(dia = 1, mes = 2, ano = 1993,)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
}