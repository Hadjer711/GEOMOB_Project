package com.example.geomob.BD

import androidx.room.*
import com.example.geomob.UTILS.ListConverter

@Entity(tableName = "pays")
data class Pays(
    @PrimaryKey var id: Int? = null,
    var nom: String,

    var description: String,

    var drapeau: String,

    var surface: Float,

    var population: Int,


    var imagesSlides : Int,

    var hymne : Int,


    var wikipedia: String,


    var videos: String

){
    override fun toString(): String {
        return "pays(nom='$nom', drapeau='$drapeau', surface='$surface', description='$description')"
    }
}