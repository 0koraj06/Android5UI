package com.example.a0koraj06.android5ui;



import android.content.DialogInterface;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static com.example.a0koraj06.android5ui.R.id.addtask;


public class BoxingDiary extends AppCompatActivity  {
    EditText taskname,task;
    TextView gettask;
    MyHelper helper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);



        taskname = (EditText) findViewById(R.id.taskname);
        task = (EditText) findViewById(R.id.task);
        gettask = (TextView) findViewById(R.id.gettask);
        helper = new MyHelper(this, "", null, 1);

    }

    public void btn_click(View view) {

        switch (view.getId()){
            case R.id.addtask:
                try{
                    helper.add_task(taskname.getText().toString() +" ", task.getText().toString()+"\n");
                }catch (SQLiteException e){
                    Toast.makeText(BoxingDiary.this, "ALREADY EXISTS", Toast.LENGTH_SHORT).show();
                }
            break;
            case R.id.deletetask:
                helper.delete_task(taskname.getText().toString());
            break;
            case R.id.updatetask:
                AlertDialog.Builder dialog = new AlertDialog.Builder(BoxingDiary.this);
                dialog.setTitle("ENTER NEW TASK");

                final EditText new_task = new EditText(this);
                dialog.setView(new_task);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        helper.update_task(taskname.getText().toString(), new_task.getText().toString());

                    }
                });
                dialog.show();
            break;

            case R.id.viewtask :
                helper.view_tasks(gettask);
            break;

        }


    }


}