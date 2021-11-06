package fundamentos.Controle

    /*
    * usando o for com controle de "passos"
    * primeiro de forma ascente
    *
    * */


fun main(args: Array<String>) {
    for(i in 0..100 step 5){
        println(i)
    }

    for(i in 100 downTo 0 step 5){
        println(i)
    }
}