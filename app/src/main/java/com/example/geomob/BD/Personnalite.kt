package com.example.geomob.BD

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "personnalite", indices = [androidx.room.Index("pays")], foreignKeys =[ForeignKey(entity = Pays::class,parentColumns = ["id"], childColumns = ["pays"])]
)
data class Personnalite(
    @PrimaryKey(autoGenerate = true)var id: Int? = null,
    var nom: String,

    var image: String,
    var description: String,

    var lienWiki: String,

    var pays: Int

)