package com.example.geomob

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
public interface PersonnaliteDAO {
    @Query("SELECT * FROM personnalite")
    fun getPersonnalite(): MutableList<Personnalite>

    @Query("SELECT * FROM personnalite WHERE id = :num")
    fun getOnePersonnalite(num: Int): List<Personnalite>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun ajouter(personnalite: Personnalite )

    // get of one pays

}