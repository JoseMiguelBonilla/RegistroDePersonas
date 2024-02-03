package com.ucne.registrodepersonas.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ucne.registrodepersonas.data.local.dao.PersonaDao
import com.ucne.registrodepersonas.data.local.entity.Persona

@Database(
    entities = [Persona::class],
    version = 1,
    exportSchema = false
)
abstract class PersonasDB : RoomDatabase(){
    abstract fun personaDao() : PersonaDao
}