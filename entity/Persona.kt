package com.ucne.registrodepersonas.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Personas")
data class Persona (
    @PrimaryKey
    val personaId : Int? = null,
    val nombres : String,
    val apellidos : String,
    val telefono : String,
    val direccion : String,
    val fechadeNacimiento : String,
    val ocupaciones : String
)