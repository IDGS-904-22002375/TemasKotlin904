package com.example.temaskotlin904.app.tema4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R

class Tema4 : AppCompatActivity() {
    private val fileName = "datos.txt"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tema4)
        val inputText = findViewById<EditText>(R.id.inputText)
        val outputText = findViewById<TextView>(R.id.outputText)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val btnGuardar = findViewById<Button>(R.id.saveButton)
        val btnLeer = findViewById<Button>(R.id.readButton)

        btnBorrar.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("confirmacion")
            builder.setMessage("¿Estas seguro de que deseas borrar los datos?")
            builder.setPositiveButton("Si") { dialog, which ->
                try {
                    openFileOutput("datos.txt", MODE_PRIVATE).use {
                        it.write("".toByteArray())
                    }
                    Toast.makeText(this, "Datos borrados", Toast.LENGTH_SHORT).show()
                } catch (e: Exception) {
                    e.printStackTrace()
                    Toast.makeText(this, "Error al borrar los datos", Toast.LENGTH_SHORT).show()
                }
            }
            builder.setNegativeButton("Cancelar") { dialog, which ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }

        btnGuardar.setOnClickListener {
            val text = inputText.text.toString() + "\n"
            try {
                openFileOutput(fileName, MODE_APPEND).use {
                    it.write(text.toByteArray())
                }
                inputText.text.clear()

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        btnLeer.setOnClickListener {
            try {
                val contenido = openFileInput(fileName).bufferedReader().useLines { lines ->
                    lines.joinToString("\n")
                }
                outputText.text = contenido
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "Error al leer el archivo", Toast.LENGTH_SHORT).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}