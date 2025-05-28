package com.example.temaskotlin904.app.palindromo.palindromo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R

class ResultadoPalindromoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_palindromo_resultado)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val original = intent.getStringExtra("original")
        val invertida = intent.getStringExtra("invertida")
        val vocales = intent.getStringExtra("vocales")
        val numConsonantes = intent.getIntExtra("consonantes", 0)
        val mensaje = intent.getStringExtra("mensaje")

        findViewById<TextView>(R.id.originalText).text = "Original: $original"
        findViewById<TextView>(R.id.invertidaText).text = "Invertida: $invertida"
        findViewById<TextView>(R.id.vocalesText).text = "Vocales: $vocales"
        findViewById<TextView>(R.id.consonantesText).text = "Consonantes: $numConsonantes"
        findViewById<TextView>(R.id.mensajeText).text = mensaje
    }
}
