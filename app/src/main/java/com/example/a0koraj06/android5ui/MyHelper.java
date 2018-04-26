package com.example.a0koraj06.android5ui;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import java.util.ArrayList;

/**
 * Created by Jason on 21/04/2018.
 */

public class MyHelper extends SQLiteOpenHelper {

    static final int VERSION = 1;
    static final String DATABASE_NAME = "TestDB";

    public MyHelper(Context ctx ){

        super(ctx, DATABASE_NAME, null, VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL ("CREATE TABLE IF NOT EXISTS Diary (Id INTEGER PRIMARY KEY, Name VARCHAR(255), Task VARCHAR(255))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL ("DROP TABLE IF EXISTS Diary");
        onCreate(db);
    }

    public long addTask(String Name, String Task)
    {
        SQLiteDatabase db = getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement
                ("INSERT INTO Diary(Name,Task) VALUES (?, ?)");
        stmt.bindString (1, Name);
        stmt.bindString (2, Task);

        long id = stmt.executeInsert();
        return id;
    }

    public void deleteTask(String task) {}



}
