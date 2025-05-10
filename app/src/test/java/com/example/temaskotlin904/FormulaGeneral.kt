package com.example.temaskotlin904

fun main() {
    formulaGeneral()
}
fun formulaGeneral(){
    print("Escriba el primer numero b")
    val valorb = readln().toInt()
    print("Escriba el segundo numero a")
    val valora = readln().toInt()
    print("Escriba el tercer numero c")
    val valorc = readln().toInt()

    val resultado = valorb*valorb-4*valora*valorc
    if (resultado <= 0){
        println("error")
        return formulaGeneral()
    }else{
        val xnegativa = (-valorb + Math.sqrt(resultado.toDouble())) / (2 * valora)
        val xpositiva = (-valorb - Math.sqrt(resultado.toDouble())) / (2 * valora)
        println(" resultado con la formula en - = $xnegativa, resultado con la formula en + = $xpositiva")
    }
    //MATH.SQRT FUNCION PARA RAIZ
}
