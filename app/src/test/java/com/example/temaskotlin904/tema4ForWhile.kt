package com.example.temaskotlin904

/*
Range= ..
1..4=1,2,3,4
1..<4=1,2,3
4 downTo 1=4,3,2,1
1..5 stop 2=1,3,5

'a'..'f'='a'......'f'
 */
fun main() {
    for (n in 1..5){
        println(n)
    }
    val figuras= listOf("cuadrado","triangulo","circulo")
    for (figura in figuras){
        println(figura)
    }

    var numero=0
      while (numero<5){
        println(numero)
        numero++
    }






}