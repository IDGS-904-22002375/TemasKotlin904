package com.example.temaskotlin904

import kotlin.system.exitProcess


fun sumaaa() {
    print("Escriba el numero1")
    val numero1 = readln().toDouble()
    print("Escriba el numero2")
    val numero2 = readln().toDouble()
    println("El resultado $numero1+$numero2 es ${numero1+numero2}")
menu()

}
fun resta(){
    print("Escriba el numero1")
    val numero1 = readln().toDouble()
    print("Escriba el numero2")
    val numero2 = readln().toDouble()
    println("El resultado $numero1-$numero2 es ${numero1-numero2}")
    menu()
}

fun multiplicacion() {
    print("Escriba el numero1")
    val numero1 = readln().toDouble()
    print("Escriba el numero2")
    val numero2 = readln().toDouble()
    println("El resultado $numero1*$numero2 es ${numero1*numero2}")
}

fun division() {
    print("Escriba el numero1")
    val numero1 = readln().toInt()
     if (numero1 == 0){
        println("Operacion no puede ser realizada")
         return
    } else {
         print("Escriba el numero2")
     }
    val numero2 = readln().toDouble()
    println("El resultado $numero1*$numero2 es ${numero1*numero2}")
    menu()
}

fun menu(){
    print("Elija una opcion" +
            "1 para suma"+
            "2 para resta"+
            "3 para multiplicacion"+
            "4 para division")
    val opcion = readln().toInt()
    if (opcion == 1){
        sumaaa()
    } else if (opcion ==2){
        resta()
    }
    else if(opcion == 3){
        multiplicacion()
    }
    else if(opcion ==4){
        division()
    }
    else exitProcess(5)
}

fun main(){
    menu()
}