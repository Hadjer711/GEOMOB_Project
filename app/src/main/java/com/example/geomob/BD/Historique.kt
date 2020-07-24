package com.example.geomob.BD

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "historique",indices = [Index("pays")], foreignKeys =[ForeignKey(entity = Pays::class,parentColumns = ["id"], childColumns = ["pays"])]
)
data class Historique(
    @PrimaryKey(autoGenerate = true)var id: Int? = null,
    var date: String,

    var description: String,

    var pays: Int

)