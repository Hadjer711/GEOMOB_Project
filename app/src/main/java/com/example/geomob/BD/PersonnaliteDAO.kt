package com.example.geomob.BD

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.geomob.BD.Personnalite


@Dao
public interface PersonnaliteDAO {
    @Query("SELECT * FROM personnalite")
    fun getPersonnalite(): MutableList<Personnalite>

    @Query("SELECT * FROM personnalite WHERE id = :num")
    fun getOnePersonnalite(num: Int): List<Personnalite>

    @Query("SELECT * FROM personnalite WHERE pays = :num")
    fun getPersonnalitePays(num: Int): List<Personnalite>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun ajouter(personnalite: Personnalite)

    // get of one pays

}