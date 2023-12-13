package com.example.hospital_navigation_system.database;

// importing all the classes to create a room database

import android.content.Context;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.Update;

import java.util.List;


@Database(entities = {Patient.class, Doctor.class}, version = 5, exportSchema = false)
public abstract class HospitalDB extends RoomDatabase {
    private static final String DATABASE_NAME = "hdb2";
    private static HospitalDB dbInstance;
    public abstract HospitalDataDao hDao2();
    public static synchronized HospitalDB getInstance(Context context){
        //Create new database with last name for a name if none exist
        if(dbInstance == null){
            dbInstance = Room
                    .databaseBuilder(context.getApplicationContext(), HospitalDB.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();

        }
        return dbInstance;
    }
}

