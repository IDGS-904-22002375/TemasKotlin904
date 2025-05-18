package com.example.temaskotlin904.app

import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.temaskotlin904.R

class CinepolisAndroid : AppCompatActivity() {
    private lateinit var txtNombre: EditText
    private lateinit var txtCantidadCompradores: EditText
    private lateinit var txtCantidadBoletos: EditText
    private lateinit var txtResultado: TextView
    private lateinit var radioConTarjeta: RadioButton
    private lateinit var radioSinTarjeta: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis_android)
        txtNombre = findViewById<EditText>(R.id.txtNombre)
        txtCantidadCompradores = findViewById<EditText>(R.id.txtCantidadCompradoress)
        txtCantidadBoletos = findViewById<EditText>(R.id.txtCantidadBoletos)
        txtResultado = findViewById<TextView>(R.id.txtResultado)
        radioConTarjeta = findViewById<RadioButton>(R.id.radioConTarjeta)
        radioSinTarjeta = findViewById<RadioButton>(R.id.radioSinTarjeta)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular(view: android.view.View) {
        val nombre = txtNombre.text.toString()
        val cantidadBoletoss = txtCantidadBoletos.text.toString().toInt()
        val precioBoleto = 12.000
        val totalSinDescuento = cantidadBoletoss.toInt() * precioBoleto.toDouble()
        val cantidadCompradores = txtCantidadCompradores.text.toString().toInt()

        val maximoPermitido = cantidadCompradores * 7


        if (cantidadBoletoss > maximoPermitido) {
            txtResultado.text =
                "Cada comprador puede adquirir hasta 7 boletos.\nCon $cantidadCompradores"
        return
        }

        var descuentoCantidadBoletos = 0.0
        if (cantidadBoletoss.toInt() > 5) {
            descuentoCantidadBoletos = totalSinDescuento * 0.25
        } else if (cantidadBoletoss.toInt() > 3 && cantidadBoletoss.toInt() <= 5) {
            descuentoCantidadBoletos = totalSinDescuento * 0.10
        } else if (cantidadBoletoss.toInt() <= 2) {
            descuentoCantidadBoletos = 0.0

        }
        val totalConDescuento = totalSinDescuento - descuentoCantidadBoletos
        val tieneTarjeta = radioConTarjeta.isChecked
        val descuentoTarjeta = if (tieneTarjeta) totalConDescuento * 0.10 else 0.0

        val totalFinal = totalConDescuento - descuentoTarjeta

        txtResultado.text = " $nombre\nTotal a pagar: $$totalFinal"

    }

        }