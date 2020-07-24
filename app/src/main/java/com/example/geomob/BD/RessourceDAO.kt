package com.example.geomob.BD

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.geomob.BD.Personnalite
import com.example.geomob.BD.Ressource


@Dao
public interface RessourceDAO {
    @Query("SELECT * FROM ressource")
    fun getRessource(): MutableList<Ressource>

    @Query("SELECT * FROM ressource WHERE id = :num")
    fun getOneRessource(num: Int): List<Ressource>

    @Query("SELECT * FROM ressource WHERE pays = :num")
    fun getRessourcePays(num: Int): List<Ressource>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun ajouter(ressource: Ressource)

    // get of one pays

}