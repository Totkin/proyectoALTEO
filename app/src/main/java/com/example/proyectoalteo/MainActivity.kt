package com.example.proyectoalteo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.Toast
import com.google.android.material.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_almacenamiento.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            button1.animate().apply{
                rotationBy(360f)
            }.withEndAction{
                startActivity(Intent(this, Almacenamiento::class.java))
            }
        }

        button2Memoria.setOnClickListener{
            button2Memoria.animate().apply{
                duration=1000
                rotationXBy(360f)
            }.withEndAction{
                Toast.makeText(this, "Configuración Memoria Interna", Toast.LENGTH_SHORT).show()
                startActivity(Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS))
            }
        }

        button2FechaHora.setOnClickListener{
            button2FechaHora.animate().apply{
                duration=1000
                rotationXBy(360f)
            }.withEndAction{
                Toast.makeText(this, "Configuración Fecha y Hora", Toast.LENGTH_SHORT).show()
                startActivity(Intent(Settings.ACTION_DATE_SETTINGS))
            }
        }

        button3.setOnClickListener{
            button3.animate().apply{
                duration=1000
                rotationYBy(360f)
            }.withEndAction{
                startActivity(Intent(this, Navegador::class.java))
            }

        }
        //lolololooolo
        //hola Kike
    }
}
