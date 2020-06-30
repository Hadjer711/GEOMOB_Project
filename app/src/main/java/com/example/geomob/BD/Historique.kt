package com.example.geomob.BD

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "historique")
data class Historique(
    @PrimaryKey(autoGenerate = true)var id: Int? = null,
    var date: String,

    var description: String

)