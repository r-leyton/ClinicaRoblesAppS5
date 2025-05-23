package com.example.clinicaroblesapps5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recycler: RecyclerView
    private lateinit var adapter: EspecialidadAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val especialidades = listOf(
            Especialidad("Traumatología", "Dr. Alberto García Cerna", "Lunes a Viernes, 8am - 4pm", R.drawable.traumatologia),
            Especialidad("Cardiología", "Dr. Roberto Chavesta Bernal", "Lunes a Viernes, 8am - 4pm", R.drawable.cardiologia),
            Especialidad("Cirugía Cardiovascular", "Dr. Romel Zamudio Silva", "Martes y Jueves, 9am - 3pm", R.drawable.cirugia_cardiovascular),
            Especialidad("Medicina General", "Dr. Elvis Laveriano Honorio", "Todos los días, 7am - 7pm", R.drawable.medicina_general),
            Especialidad("Medicina Interna", "Dr. Luis Cabrera Ciprian", "Lunes a Viernes, 9am - 5pm", R.drawable.medicina_interna),
            Especialidad("Pediatría", "Dra. Yoselin Cabrera Álvarez", "Lunes a Viernes, 8am - 4pm", R.drawable.pediatria),
            Especialidad("Ginecología", "Dra. Rossy Rosales Zaneli", "Lunes y Miércoles, 10am - 2pm", R.drawable.ginecologia),
            Especialidad("Dermatología", "Dra. Mónica Anco Huamán", "Viernes, 9am - 1pm", R.drawable.dermatologia),
            Especialidad("Endocrinología", "Dr. Juan Pinto Sánchez", "Lunes, 8am - 2pm", R.drawable.endocrinologia),
            Especialidad("Gastroenterología", "Dra. Kelly Casanova Novoa", "Martes y Jueves, 11am - 3pm", R.drawable.gastroenterologia),
            Especialidad("Otorrino", "Dr. Jorge Bonilla Vargas", "Lunes y Viernes, 10am - 3pm", R.drawable.otorrino),
            Especialidad("Oftalmología", "Dra. Anita Vigo Arroyo", "Lunes a Viernes, 9am - 5pm", R.drawable.oftalmologia),
            Especialidad("Neurología", "Dr. Nilo Valenzuela Velarde", "Miércoles, 9am - 1pm", R.drawable.neurologia),
            Especialidad("Neumología", "Dra. Melisa Montoya Calles", "Martes, 8am - 12pm", R.drawable.neumologia),
            Especialidad("Psicología", "Lic. Luz Yamileth Marrón", "Lunes a Viernes, 8am - 4pm", R.drawable.psicologia),
            Especialidad("Nutrición", "Lic. Leidy Villanueva Grados", "Todos los días, 8am - 2pm", R.drawable.nutricion),
            Especialidad("Cirugía Maxilofacial", "Dr. Julio Robles Ramos", "Viernes, 10am - 2pm", R.drawable.cirugia_maxilofacial),
            Especialidad("Urología", "Dr. Jesús Pascual Plasencia", "Jueves, 8am - 1pm", R.drawable.urologia),
            Especialidad("Neurocirugía", "Dr. Willy Caballero Grados", "Sábado, 9am - 12pm", R.drawable.neurocirugia),
            Especialidad("Medicina Física", "Dr. Luis Vásquez", "Lunes a Viernes, 9am - 5pm", R.drawable.medicina_fisica)
        )

        recycler = findViewById(R.id.recyclerEspecialidades)
        recycler.layoutManager = LinearLayoutManager(this)
        adapter = EspecialidadAdapter(especialidades)
        recycler.adapter = adapter
    }
}