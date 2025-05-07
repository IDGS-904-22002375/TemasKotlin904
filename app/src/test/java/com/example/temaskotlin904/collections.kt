package com.example.temaskotlin904

/*
    - List: Lista inmutable (no se puede modificar)
    - MutableList: Lista mutable (puedes agregar, quitar, modificar elementos)
    - MutableSet: Conjunto mutable (sin elementos duplicados, pero se puede modificar)
    - Map: Mapa inmutable (pares clave-valor que no se pueden cambiar)
    - MutableMap: Mapa mutable (pares clave-valor que sí se pueden cambiar)
    ---------------------------------------------------
*/
fun main() {
    

    val readOnlyFiguras = listOf("Cuadrado", "Triángulo", "Círculo")
    println(readOnlyFiguras)  // Imprime la lista
    var figura: MutableList<String> = mutableListOf("Cuadrado", "Triángulo", "Círculo")


    val readOnlyFigurass = listOf("Cuadrado", "Triángulo", "Círculo")
    val mutableFigura: List<String> = figura


    val frutas = setOf("Manzana", "Banana", "Naranja")

    val frutass = mutableSetOf("Manzana", "Banana", "Naranja")

    val coches = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println(coches)

    val cochess = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println(cochess)
}