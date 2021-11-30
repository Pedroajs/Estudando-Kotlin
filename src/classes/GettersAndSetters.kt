package classes

class Cliente2 {
    constructor(nome: String){
        this.nome = nome
    }

    // o metodo get esta associado a variavel nome
    // field da acesso ao valor a que get ta associado
    // get e set podem ter funcoes
    var nome: String
        get() = "Meu nome é ${field}"
        set(value)  {
            field = value.takeIf { value.isNotEmpty() } ?: "Anonimo"
        }
}

fun main() {
    val c1 = Cliente2("")
    println(c1.nome)
}