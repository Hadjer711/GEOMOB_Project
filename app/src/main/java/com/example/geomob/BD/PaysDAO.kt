package com.example.projetgeomob


import androidx.room.*
import com.example.geomob.BD.Pays


@Dao
public interface PaysDAO {
    @Query("SELECT * FROM pays")
    fun getPays(): MutableList<Pays>

    @Query("SELECT * FROM pays WHERE id = :num")
    fun getOnePays(num: Int): List<Pays>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun ajouter(pays: Pays)

}


