package com.example.proyectoalteo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_configuracion.*

class Configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

//        memoria.setOnClickListener { // Al hacer click en el primer boton nos muestra la configuración del almacenamiento
//            openInternalStorage()   // llama al metodo e inicia el intent
//            Toast.makeText(this, "Configuración Memoria Interna", Toast.LENGTH_SHORT).show()
//        }
//
//        fecha.setOnClickListener { // Al hacer click en el segundo boton nos muestra la configuracion de fecha/hora
//           openDateSettings()  // llama al metodo e inicia el intent
//           Toast.makeText(this, "Configuración Fecha y Hora", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//     //Metodos
//    @SuppressLint("QueryPermissionsNeeded")
//    fun openInternalStorage() {
//        val configuracion1 = Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS)
//        startActivity(configuracion1)
//    }
//
//    @SuppressLint("QueryPermissionsNeeded")
//    fun openDateSettings() {
//        val configuracion2 = Intent(Settings.ACTION_DATE_SETTINGS)
//        startActivity(configuracion2)
//    }
    }
}