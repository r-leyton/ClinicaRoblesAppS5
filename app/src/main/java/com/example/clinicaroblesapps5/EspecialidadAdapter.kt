package com.example.clinicaroblesapps5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EspecialidadAdapter(private val lista: List<Especialidad>) :

    RecyclerView.Adapter<EspecialidadAdapter.EspecialidadViewHolder>() {

        inner class EspecialidadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val nombre = itemView.findViewById<TextView>(R.id.tvNombre)
            val medico = itemView.findViewById<TextView>(R.id.tvMedico)
            val horario = itemView.findViewById<TextView>(R.id.tvHorario)
            val imagen = itemView.findViewById<ImageView>(R.id.imgEspecialidad)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EspecialidadViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_especialidad, parent, false)
            return EspecialidadViewHolder(view)
        }

        override fun onBindViewHolder(holder: EspecialidadViewHolder, position: Int) {
            val item = lista[position]
            holder.nombre.text = item.nombre
            holder.medico.text = item.doctor
            holder.horario.text = item.horario
            holder.imagen.setImageResource(item.imagenResId)
        }

        override fun getItemCount(): Int = lista.size


    }

