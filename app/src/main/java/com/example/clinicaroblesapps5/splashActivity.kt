package com.example.clinicaroblesapps5

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_splash) // Asegúrate que ese sea tu archivo XML

        // Referencias a los elementos de la vista
        val imgLogo = findViewById<ImageView>(R.id.imgViewLogo)
        val tvBienvenidos = findViewById<TextView>(R.id.tvBienvenidos)
        val btnIngresar = findViewById<MaterialButton>(R.id.btnIngresar)

        // Animaciones
        val fadeIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in)
        val slideIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)

        imgLogo.startAnimation(fadeIn)
        tvBienvenidos.startAnimation(fadeIn)
        btnIngresar.startAnimation(slideIn)

        // Botón para ir a la siguiente pantalla
        btnIngresar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) // Cambia a tu destino real
            startActivity(intent)
            finish()
        }


    }
}