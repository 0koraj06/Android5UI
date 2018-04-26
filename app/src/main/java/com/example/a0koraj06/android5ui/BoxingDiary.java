package com.example.a0koraj06.android5ui;



import android.os.Bundle;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import static com.example.a0koraj06.android5ui.R.id.addtask;


public class BoxingDiary extends AppCompatActivity implements View.OnClickListener {
    EditText taskname,task;
    MyHelper DbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);


        DbHelper = new MyHelper(this);
        taskname = (EditText) findViewById(R.id.taskname);
        task = (EditText) findViewById(R.id.task);

        Button btn = (Button) findViewById(addtask);
        btn.setOnClickListener(this);

    }

    public void onClick(View view) {

        EditText TaskName = (EditText) findViewById(R.id.taskname);
        String taskname = TaskName.getText().toString() ;

        EditText Task = (EditText) findViewById(R.id.task);
        String task = Task.getText().toString();



        long id =  DbHelper.addTask(taskname,task);

        new AlertDialog.Builder(this).setPositiveButton("OK", null).
                setMessage(""+id).show();

    }


}