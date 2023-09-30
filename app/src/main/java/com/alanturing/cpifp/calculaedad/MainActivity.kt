package com.alanturing.cpifp.calculaedad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.time.LocalDate
import java.time.Period

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonCalcular = findViewById<Button>(R.id.boton_calcular)
        val controlFecha = findViewById<DatePicker>(R.id.selec_fecha)


        botonCalcular.setOnClickListener {
            //TODO: Obten el texto que muestra la edad y pon
            // un texto que diga "Tienes X años" donde X es la edad
            // usa la función calcularEdadFromDate

            // TODO: Obten el año, el día del  mes y el mes de controlFecha

        }
    }
    // TODO: CALCULA LA EDAD
    private fun calcularEdadFromDate(year:Int,month:Int,day:Int) = 0
        // Puedes usar las clases Period y LocalDate para realizar los calculos

}