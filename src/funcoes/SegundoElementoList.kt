package funcoes


// significa que essa lista inicializada tem um tipo generico E e retorna esse mesmo


fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    val list = listOf("joao", "maria", "pedro")

    println(list.secondOrNull())
}

/*
* Essa função foi adicionada como extenção a List sem a necessidade de instanciar uma classe
* Outra vantagem é adicionar funcionalidades no local certo, ou seja, quanto mais próxima a funçao
* estiver próxima dos dados que ela manipula, melhor ela pode ser modelada
*
* */