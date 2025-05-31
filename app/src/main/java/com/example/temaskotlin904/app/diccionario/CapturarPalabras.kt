
package com.example.temaskotlin904.app.diccionario
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R


class CapturarPalabras : AppCompatActivity() {
    private lateinit var txtEspañol: EditText
    private lateinit var txtIngles: EditText
    private lateinit var txtResult: TextView
    private lateinit var btnGuardar: Button
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_capturar_palabras)
        txtEspañol = findViewById<EditText>(R.id.txtEspañol)
        txtIngles = findViewById<EditText>(R.id.txtIngles)
        txtResult = findViewById<TextView>(R.id.txtResult)
        btnGuardar = findViewById<Button>(R.id.btnGuardar)
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

    fun guardarPalabrasEnArreglo(view: View) {
        val palabrasEspañol = txtEspañol.text.toString().split("\\s+".toRegex())
        val palabrasIngles = txtIngles.text.toString().split("\\s+".toRegex())

        Diccionario.DiccionarioP.diccionario.clear()

        for (i in palabrasEspañol.indices) {
            if (i < palabrasIngles.size) {
                Diccionario.DiccionarioP.diccionario[palabrasEspañol[i]] = palabrasIngles[i]
            }
        }
        txtResult.text = Diccionario.DiccionarioP.diccionario.entries.joinToString("\n") { "${it.key}  ${it.value}" }
        Toast.makeText(view.context, "Palabra guardada correctamente", Toast.LENGTH_SHORT).show()

    }

}