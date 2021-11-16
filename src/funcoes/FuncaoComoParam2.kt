package funcoes

import java.util.ArrayList

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E>{
    val listaFiltrada = ArrayList<E>()

    for(element in lista){
        if(filtro(element)){
            listaFiltrada.add(element)
        }
    }

    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean{
    return nome.length == 3
}

fun main() {
    val nomes = listOf("João", "Maria", "Pedro", "Ana", "Bia")

    println(filtrar(nomes, ::comTresLetras))
}