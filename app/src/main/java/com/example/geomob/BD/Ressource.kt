package com.example.geomob.BD

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "ressource", indices = [Index("pays")], foreignKeys =[ForeignKey(entity = Pays::class,parentColumns = ["id"], childColumns = ["pays"])]
)
data class Ressource(
    @PrimaryKey(autoGenerate = true)var id: Int? = null,
    var nom: String,


    var quantite: String,

    var pays: Int

)