package com.example.proyectoalteo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.*

class Almacenamiento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_almacenamiento)

        val nombreFichero = findViewById<EditText>(R.id.editFile)
        val datosFichero = findViewById<EditText>(R.id.editData)

        val btnGuardar = findViewById<Button>(R.id.btnSave)
        val btnVer = findViewById<Button>(R.id.btnView)

        btnGuardar.setOnClickListener(View.OnClickListener {
            val fichero: String = nombreFichero.text.toString()
            val data: String = datosFichero.text.toString()
            val fileOutputStream: FileOutputStream
            try {
                fileOutputStream = openFileOutput(fichero, MODE_PRIVATE)
                fileOutputStream.write(data.toByteArray())
                Log.d("TAG1", "Fichero Salvado en: " + getFilesDir() + "/" + fichero)
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            } catch (e: NumberFormatException) {
                e.printStackTrace()
            } catch (e: IOException) {
                e.printStackTrace()
            } catch (e: Exception) {
                e.printStackTrace()
            }
            Toast.makeText(applicationContext, "guardado", Toast.LENGTH_LONG).show()
            nombreFichero.text.clear()
            datosFichero.text.clear()
        })

        btnVer.setOnClickListener(View.OnClickListener {
            val filename = nombreFichero.text.toString()
            if (filename.toString() != null && filename.toString().trim() != "") {
                var fileInputStream: FileInputStream? = null
                fileInputStream = openFileInput(filename)
                var inputStreamReader: InputStreamReader = InputStreamReader(fileInputStream)
                val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
                val stringBuilder: StringBuilder = StringBuilder()
                var text: String? = null
                while ({ text = bufferedReader.readLine(); text }() != null) {
                    stringBuilder.append(text)
                }
                //Displaying data on EditText
                datosFichero.setText(stringBuilder.toString()).toString()
            } else {
                Toast.makeText(
                    applicationContext,
                    " fichero no puede estar vacio",
                    Toast.LENGTH_LONG
                ).show()
            }
        })
    }}