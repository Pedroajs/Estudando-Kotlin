package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null
    println(a?.dec())

    println("Momento do erro")
    println(a!!.inc())
}