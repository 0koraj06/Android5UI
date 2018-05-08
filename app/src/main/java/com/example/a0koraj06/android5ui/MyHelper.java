package com.example.a0koraj06.android5ui;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jason on 21/04/2018.
 */

public class MyHelper extends SQLiteOpenHelper {

 public MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
     super(context, "TEXT.db", factory, version);

 }@Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){

        sqLiteDatabase.execSQL("CREATE TABLE DIARY(ID INTEGER PRIMARY KEY AUTOINCREMENT, TASKNAME TEXT UNIQUE, TASK TEXT);");
    }
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS DIARY;");
        onCreate(sqLiteDatabase);

    }
    public void add_task(String taskname, String task ){
        ContentValues contentValues = new ContentValues();
        contentValues.put("TASKNAME", taskname);
        contentValues.put("TASK", task);
        this.getWritableDatabase().insertOrThrow("DIARY","",contentValues);

    }
    public void delete_task(String taskname){
        this.getWritableDatabase().delete("DIARY","TASKNAME='"+taskname+"'", null);
    }

    public void update_task(String old_taskname, String new_taskname){
        this.getWritableDatabase().execSQL("UPDATE DIARY SET TASKNAME='"+new_taskname+"' WHERE TASKNAME='"+old_taskname+"'");

    }

    public void view_tasks(TextView textView){
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM DIARY", null);
        while (cursor.moveToNext()){
            textView.append(cursor.getString(1) + "" + cursor.getString(2));
        }

    }



}
