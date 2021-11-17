package classes
// Esse é um modo de fazer um construtor, abrindo parenteses logo depois de declarar a classe

class Pessoa1(var nome: String, val idade: Int)
class Pessoa2(val nome: String)

// esse atributo sem declaracao var ou val nao vai gerar um atributo visivel nas instancias dos objetos
// Servirá apenas como variável local do método. Estará dosponivel apenas no construtor ou no processo inicialização do objeto


class Pessoa3(nomeInicial: String){
    val nome:String = nomeInicial
}

fun main() {
    val p1 = Pessoa1("Pedro", 28)
    p1.nome = "João"
    println("${p1.nome} sabe programar")

    val p2 = Pessoa2(nome = "Maria")
    val p3 = Pessoa3("Matheus")
}