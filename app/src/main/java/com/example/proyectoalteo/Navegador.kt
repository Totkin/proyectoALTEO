package com.example.proyectoalteo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class Navegador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_navegador)

        val miVisorWeb: WebView = findViewById(R.id.visor)      //inicializamos el visor WebView
        miVisorWeb.webViewClient = object : WebViewClient(){    //le diremos que use el cliente de Internet nativo del Dispositivo
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String                                     //Cambio la solicitud por una URL que sera String
            ): Boolean {
                view?.loadUrl(url)                              //pedimos que nos muestre el contenido de la url
                return true
            }
        }
        miVisorWeb.loadUrl("https://google.com")            //direccoin donde vamos a  buscar
        miVisorWeb.settings.javaScriptEnabled=true
        miVisorWeb.settings.allowContentAccess=true
        miVisorWeb.settings.domStorageEnabled=true
        miVisorWeb.settings.useWideViewPort=true                   //configuramos para que no tenga limites al cargar el sitio WEB
        miVisorWeb.settings.setAppCacheEnabled(true)            //el guardado de cache esta absoleto para esta API, pero aun lo pondre
    }
    //fin
}