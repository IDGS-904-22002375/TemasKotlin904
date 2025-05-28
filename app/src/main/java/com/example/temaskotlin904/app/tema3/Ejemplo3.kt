package com.example.temaskotlin904.app.tema3

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R

class Ejemplo3 : AppCompatActivity() {
    private lateinit var editext: EditText
    private var num=0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo_3)
        editext=findViewById(R.id.ed1)
        num=(Math.random()*100001).toInt()
        val cadena=num.toString()
        val notificacion = Toast.makeText(this,cadena,Toast.LENGTH_LONG)
        notificacion.show()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun controlar(view: android.view.View){
        val valoringresado: String = editext.text.toString()
        val valor=valoringresado.toInt()
        if(valor==num){
            val notificacion = Toast.makeText(this,"Correcto",Toast.LENGTH_LONG)
       notificacion.show()
        }else{
            val notificacion = Toast.makeText(this,"Incorrecto",Toast.LENGTH_LONG)
            notificacion.show()
        }
    }
}