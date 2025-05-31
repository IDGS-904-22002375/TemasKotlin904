package com.example.temaskotlin904.app.diccionario
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R


class Principal_diccionario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_principal_diccionario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun capturarPalabras(view: View) {
        val intent = Intent(this, CapturarPalabras::class.java)
        startActivity(intent)
    }
    fun buscarPalabras(view: View) {
        val intent = Intent(this, BuscarPalabras::class.java)
        startActivity(intent)
    }
}