package com.example.temaskotlin904.app.diccionario

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R


class BuscarPalabras : AppCompatActivity() {
    private lateinit var txtPalabra: EditText
    private lateinit var txtResultado: TextView
    private lateinit var radioEspanol: RadioButton
    private lateinit var radioIngles: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buscar_palabras)
        txtPalabra = findViewById(R.id.txtPalabra)
        txtResultado = findViewById(R.id.txtResultado)
        radioEspanol = findViewById(R.id.radioEspanol)
        radioIngles = findViewById(R.id.radioIngles)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun regresarAlMenu(view: View) {
        val intent = Intent(this, Principal_diccionario::class.java)
        startActivity(intent)
    }

    fun buscarPalabra(view: View) {
        val palabra = txtPalabra.text.toString().trim()
        val diccionario = Diccionario.DiccionarioP.diccionario
        var resultado = "No encontrado"
        if (radioEspanol.isChecked) {
            resultado = diccionario[palabra]?.let { " $it" } ?: "No encontrado"
        } else if (radioIngles.isChecked) {
            val entry = diccionario.entries.find { it.value == palabra }
            if (entry != null) {
                resultado = " → ${entry.key}"
            }
        }
        txtResultado.text = resultado
    }

}