package com.example.aplicacionpalindromo.palindromo

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.temaskotlin904.R
import com.example.temaskotlin904.app.palindromo.palindromo.ResultadoPalindromoActivity

class Palindromo : AppCompatActivity() {
    private lateinit var cadena: EditText
    private lateinit var resultado: TextView
    private lateinit var analizar: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindromo)

        cadena = findViewById(R.id.cadena)
        resultado = findViewById(R.id.resultado)
        analizar = findViewById(R.id.analizar)

        analizar.setOnClickListener {
            val textoOriginal = cadena.text.toString().trim()
            val textoLimpio = limpiarTexto(textoOriginal)
            val invertida = textoLimpio.reversed()

            if (esPalindromo(textoLimpio)) {
                val intent = Intent(this, ResultadoPalindromoActivity::class.java)
                intent.putExtra("original", textoOriginal)
                intent.putExtra("invertida", invertida)
                intent.putExtra("vocales", obtenerVocales(textoLimpio))
                intent.putExtra("consonantes", contarConsonantes(textoLimpio))
                intent.putExtra("mensaje", "La cadena es un palíndromo")
                startActivity(intent)
            } else {
                resultado.text = "No es un palíndromo"
            }
        }
    }

    private fun limpiarTexto(texto: String): String {
        return texto.lowercase().replace(Regex("[^a-z0-9]"), "")
    }

    private fun esPalindromo(texto: String): Boolean {
        return texto == texto.reversed()
    }

    private fun obtenerVocales(texto: String): String {
        return texto.filter { it in "aeiou" }.toSet().joinToString(", ")
    }

    private fun contarConsonantes(texto: String): Int {
        return texto.count { it in 'a'..'z' && it !in "aeiou" }
    }
}
