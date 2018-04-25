package com.example.a0koraj06.android5ui;


import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BoxingDiary extends AppCompatActivity {
    EditText taskname,task;
    MyHelper DbHelper;
    ListView alist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);

        taskname = (EditText) findViewById(R.id.taskname);
        task = (EditText) findViewById(R.id.task);
        DbHelper = new MyHelper(this);


    }


}