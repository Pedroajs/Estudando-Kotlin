package classes

class Stack{
    var elements: MutableList<Any> = mutableListOf()

    fun push(element: Int) = elements.add(element)

    fun pop(): Any{
        val item: Any = elements.lastOrNull()!!
        if(!isEmpty()) {
            elements.removeAt(elements.size - 1)
        }
        return item
    }

    fun peek(): Any? = elements.lastOrNull()

    fun clear(){}


    fun isEmpty():Boolean = elements.size == 0

    fun size():Int =  elements.size

    override fun toString():String = elements.toString()
}

fun main() {
    var pilha = Stack()
    pilha.push(1)
    pilha.push(2)
    pilha.clear()
    println(pilha.toString())



}