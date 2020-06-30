package com.example.geomob.BD

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ressource")
data class Ressource(
    @PrimaryKey(autoGenerate = true)var id: Int? = null,
    var nom: String,

    var type: String,

    var quantite: String

)