package com.example.temaskotlin904

fun main() {
    dibujarPiramidee()
}


fun dibujarPiramidee() {
    print("Escriba un numero")
    val alt = readln().toInt()
    if (alt == 0) return
    val altura = if (alt > 5) 5 else alt
    var fila = 1

    do {
        var asterisco = 1
        do {
            print("*")
            asterisco++
        } while (asterisco <= fila)

        println()
        fila++
    } while (fila <= altura)
}
