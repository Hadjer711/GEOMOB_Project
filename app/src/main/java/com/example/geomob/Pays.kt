package com.example.geomob

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pays")
data class Pays(
    @PrimaryKey(autoGenerate = true)var id: Int? = null,
    var nom: String,

    var description: String,

    var drapeau: String,

    var surface: Float,

    var population: Int

){
    override fun toString(): String {
        return "pays(nom='$nom', drapeau='$drapeau', surface='$surface', description='$description')"
    }
}