package com.example.temaskotlin904.app.tema2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R

class Ejemplo2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo2)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val edtName = findViewById<AppCompatEditText>(R.id.edtName)

        btnStart.setOnClickListener {
            val name = edtName.text.toString()
            val intent = Intent(this, ResultadoActivity::class.java).apply {
                putExtra("name", name)
            }
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
