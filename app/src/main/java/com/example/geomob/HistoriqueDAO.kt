package com.example.geomob

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
public interface HistoriqueDAO {
    @Query("SELECT * FROM historique")
    fun getHistorique(): MutableList<Historique>

    @Query("SELECT * FROM historique WHERE id = :num")
    fun getOneHistorique(num: Int): List<Historique>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun ajouter(historique: Historique )

    // get of one pays

}