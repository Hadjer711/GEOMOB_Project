package com.example.geomob.BD

import androidx.room.*
import com.example.geomob.UTILS.ListConverter

@Entity(tableName = "pays",indices = [Index("historique"), Index("personnalite"), Index("ressource")], foreignKeys = [ForeignKey(entity = Historique::class,
    parentColumns = ["id"], childColumns = ["historique"]),ForeignKey(entity = Personnalite::class,
    parentColumns = ["id"], childColumns = ["personnalite"]),
    ForeignKey(entity = Ressource::class,
        parentColumns = ["id"], childColumns = ["ressource"])
])
data class Pays(
    @PrimaryKey(autoGenerate = true)var id: Int? = null,
    var nom: String,

    var description: String,

    var drapeau: String,

    var surface: Float,

    var population: Int,


    var imagesSlides : String,

    var hymne : Int,

    var historique: Int?,

    var personnalite: Int?,

    var ressource: Int?,

    var wikipedia: String,


    var videos: String

){
    override fun toString(): String {
        return "pays(nom='$nom', drapeau='$drapeau', surface='$surface', description='$description')"
    }
}