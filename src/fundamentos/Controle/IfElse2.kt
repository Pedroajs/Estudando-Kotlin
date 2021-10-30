package fundamentos.Controle
/*
* Usando o operador if else como expressão
* */
fun main() {
    val num1:Int=2
    val num2:Int=3

    val maiorValor = if(num1 > num2){
        println("processando if...")
         num1
    } else{
        //a ultima sentença do bloco deve ser a variavel que se quer retornar
        //e atribuir a constante
        println("processando else...")
         num2
    }

    println("o maior valor é ${maiorValor}")
}