package com.example.temaskotlin904.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R

class Ejercicio2 : AppCompatActivity() {
    private lateinit var a: EditText
    private lateinit var b: EditText
    private lateinit var c: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio2)
        a = findViewById<EditText>(R.id.a)
        b = findViewById<EditText>(R.id.b)
        c = findViewById<TextView>(R.id.c)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun operacion(view: android.view.View) {
        val num1 = a.text.toString()
        val num2 = b.text.toString()
        val resultado = num1.toDouble() * num2.toDouble()
        c.text = resultado.toString()
    }
    fun irPrimer(view: View) {
        val intent = Intent(this, Ejercicio1Activity::class.java)
        startActivity(intent)
    }


}