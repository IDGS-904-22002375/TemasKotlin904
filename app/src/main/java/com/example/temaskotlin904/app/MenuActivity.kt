package com.example.temaskotlin904.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R
import com.example.temaskotlin904.app.tema2.Ejemplo2Activity
import com.example.temaskotlin904.app.tema2.ResultadoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnEjemplo1  = findViewById<Button>(R.id.btn1)
        val btnEjemplo2  = findViewById<Button>(R.id.btn2)
        val btnEjemplo4  = findViewById<Button>(R.id.btn4)
        btnEjemplo1.setOnClickListener{navegateToEjemplo1()}
        btnEjemplo2.setOnClickListener{navegateToEjemplo2()}
        btnEjemplo4.setOnClickListener{navegateToEjemplo4()}
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    private fun navegateToEjemplo1(){
        val intent = Intent(this, Ejercicio1Activity::class.java)
        startActivity(intent)
    }
    private fun navegateToEjemplo2(){
        val intent = Intent(this, CinepolisAndroid::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo4(){
        val intent = Intent(this, Ejemplo2Activity::class.java)
        startActivity(intent)
    }
}