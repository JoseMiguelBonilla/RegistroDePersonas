package com.ucne.registrodepersonas.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.ucne.registrodepersonas.data.local.entity.Persona
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonaDao {
    @Upsert
    suspend fun save(persona : Persona)
    @Delete
    suspend fun delete(persona : Persona)
    @Query("SELECT * FROM Personas")
    fun getAll(): Flow<List<Persona>>
}