package com.example.temaskotlin904

fun main(){

    val a = 4
    val b = 8
    var c = 10
    println(a)
    println("el valor de b es $b")
    println("el valor de c + 2 es ${c+2}")
    c = a + 2
    c += 8
    c -= 5
    c * 8
    c /= 2

    println("el valor de c es $c")

    /*
    Comentario bloqueado con tipos explícitos:

    val num1: Int = 23  // Variable constante tipo entero
    var num2: Int = 12  // Variable mutable tipo entero
    num2 = 6  // Se cambia el valor de num2

    var nombre: String = "Carlos"  // Cadena de texto
    var caracter: Char = 'a'      // Un solo carácter

    var num4: Float = 12.5f       // Número decimal con tipo Float (necesita la 'f' al final)
    var num5: Double = 12.5       // Número decimal con mayor precisión (Double)
    */
}
