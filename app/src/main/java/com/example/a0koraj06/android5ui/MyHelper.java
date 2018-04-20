package com.example.a0koraj06.android5ui;



import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteStatement;


public class MyHelper extends SQLiteOpenHelper{

    static final int VERSION = 1;
    static final String DATABASE_NAME = "TestDB";

    public MyHelper(Context ctx) {
        super(ctx, DATABASE_NAME, null, VERSION);
    }

    public void onCreate(SQLiteDatabase db) {

        db.execSQL ("CREATE TABLE IF NOT EXISTS WBA (Id INTEGER PRIMARY KEY, Name VARCHAR(50), weightClass VARCHAR(30)");
        db.execSQL ("CREATE TABLE IF NOT EXISTS WBC (Id INTEGER PRIMARY KEY, Name VARCHAR(50), weightClass VARCHAR(30)");
        db.execSQL ("CREATE TABLE IF NOT EXISTS WBO (Id INTEGER PRIMARY KEY, Name VARCHAR(50), weightClass VARCHAR(30)");
        db.execSQL ("CREATE TABLE IF NOT EXISTS IBF (Id INTEGER PRIMARY KEY, Name VARCHAR(50), weightClass VARCHAR(30)");



    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL ("DROP TABLE IF EXISTS Champions");
        onCreate(db);
    }

    public long insertEntry(String Title, String Content, long Date)
    {
        SQLiteDatabase db = getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement
                ("INSERT INTO Diary(Title,Content,Date) VALUES (?, ?, ?),(?, ?, ?)");

        stmt.bindString (1, Title);
        stmt.bindString (2, Content);
        stmt.bindLong (3, Date);
        long id = stmt.executeInsert();
        return id;
    }




}
