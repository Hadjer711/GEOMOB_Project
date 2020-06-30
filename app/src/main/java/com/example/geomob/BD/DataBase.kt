package com.example.projetgeomob


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.geomob.BD.*


@Database(entities = [Pays::class, Historique::class, Ressource::class, Personnalite::class], version = 1, exportSchema = false)
abstract class DataBase :RoomDatabase(){
    abstract fun paysDAO(): PaysDAO
    abstract fun historiqueDAO(): HistoriqueDAO
    abstract fun ressourceDAO(): RessourceDAO
    abstract fun personnaliteDAO(): PersonnaliteDAO
    companion object {
        @Volatile private var instance: DataBase? = null
        private val LOCK = Any()
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDataBase(context).also{ instance = it}
        }
        private fun buildDataBase(context: Context ) =
            Room.databaseBuilder(context.applicationContext ,
                DataBase::class.java ,
                "pays.db").allowMainThreadQueries().build()

    }

}

