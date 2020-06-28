package com.example.geomob

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
public interface RessourceDAO {
    @Query("SELECT * FROM ressource")
    fun getRessource(): MutableList<Personnalite>

    @Query("SELECT * FROM ressource WHERE id = :num")
    fun getOneRessource(num: Int): List<Ressource>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun ajouter(ressource: Ressource)

    // get of one pays

}