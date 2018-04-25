package com.example.a0koraj06.android5ui;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Jason on 21/04/2018.
 */

public class MyHelper extends SQLiteOpenHelper {

    private static final String DB_NAME="dolist";
    private static final int DB_VER = 1;
    private static final String DB_TABLE ="Task" ;
    private static final String DB_COLUMN="TaskName" ;

    public MyHelper(Context context ){

        super(context, DB_NAME, null, DB_VER);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}

    public void insertNewTask(String task) {                                                                                                                                                                                                                                                            }

    public void deleteTask(String task) {}

    public ArrayList<String> getTaskList() {

        ArrayList<String> taskList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DB_TABLE, new String[]{DB_COLUMN}, null,null,null,null,null);
        while(cursor.moveToNext()){

            int index = cursor.getColumnIndex(DB_COLUMN);
            taskList.add(cursor.getString(index));
        }
        cursor.close();
        db.close();
        return taskList;
    }

}
