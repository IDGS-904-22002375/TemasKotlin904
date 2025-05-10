package com.example.temaskotlin904

//funcion que no recibe ni regresa parametros
fun saludo(){
    println("Hola mundo")
}

//no es necesario agregar val o var
fun suma(a:Int, b:Int){
    print("la suma de $a+ $b es ${a+b}")

}

fun resta(a:Int, b:Int):Int{
    return a-b
}

fun resta2(a:Int, b:Int)=a-b

fun main(){
    saludo()
    suma(2,3)
    println("la resta de 2-3 es ${resta(2,3)}")
}

//operaciones basicas suma, resta, multiplicacion y division, menu y elegir operacion 5 salir la suma y el menu
//un programa que me permita realizar una piramide de asteriscos pedir al usuario que de el numero y capturas la piramide de asterisctos que tenemos

//n=5
//n=0 termina
//solo utilizando do/while


//programa que permita calcular la formula general
//pedir tres numeros y dar resultado dos numeros
//mensaje no puedo efectuarlos y pedir de nuevo
//for while o do while