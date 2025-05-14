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

class Ejercicio1Activity : AppCompatActivity() {
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var tv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio1)
        et1 = findViewById<EditText>(R.id.et1)
        et2 = findViewById<EditText>(R.id.et2)
        tv1 = findViewById<TextView>(R.id.tv1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
        fun sumar(view: android.view.View) {
            val num1 = et1.text.toString()
            val num2 = et2.text.toString()
            val resultado = num1.toDouble() + num2.toDouble()
            tv1.text = resultado.toString()
        }
    fun restar(view: android.view.View) {
        val num1 = et1.text.toString()
        val num2 = et2.text.toString()
        val resultado = num1.toDouble() - num2.toDouble()
        tv1.text = resultado.toString()
    }

    fun multiplicar(view: android.view.View) {
        val num1 = et1.text.toString()
        val num2 = et2.text.toString()
        val resultado = num1.toDouble() * num2.toDouble()
        tv1.text = resultado.toString()
    }

    fun dividir(view: android.view.View) {
        val num1 = et1.text.toString()
        val num2s = et2.text.toString()
        val num2 = num2s.toDouble()
        if (num2 != 0.0) {
            val resultado = num1.toDouble()/num2.toDouble()
            tv1.text = resultado.toString()
        } else {
            tv1.text = "Division por 0"
        }
    }
    fun irASegundaPagina(view: View) {
        val intent = Intent(this, Ejercicio2::class.java)
        startActivity(intent)
    }
}
