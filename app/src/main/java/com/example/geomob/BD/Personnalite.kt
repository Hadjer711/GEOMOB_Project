package com.example.geomob.BD

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "personnalite")
data class Personnalite(
    @PrimaryKey(autoGenerate = true)var id: Int? = null,
    var nom: String,

    var image: String,
    var description: String,

    var lienWiki: String

)