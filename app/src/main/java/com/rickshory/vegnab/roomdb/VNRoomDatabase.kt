package com.rickshory.vegnab.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rickshory.vegnab.roomdb.daos.VisitDao
import com.rickshory.vegnab.roomdb.entities.Visit
import org.koin.dsl.context.Context

@Database(entities = [Visit::class], version = 1)
public abstract class VNRoomDatabase: RoomDatabase() {
    abstract fun VisitDao(): VisitDao

}

companion object {
    @Volatile
    private var INSTANCE: VNRoomDatabase? = null

    fun getDatabase(context: Context) : VNRoomDatabase {
        return INSTANCE ?: synchronized(this) { // if existing, lock
            // else create instance
            val instance = // TODO
            INSTANCE = instance
            instance
        }
    }
}