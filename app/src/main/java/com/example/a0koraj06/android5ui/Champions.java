package com.example.a0koraj06.android5ui;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Jason on 20/04/2018.
 */

public class Champions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.champions);

        String dir_path = Environment.getExternalStorageDirectory().getAbsolutePath();
        TextView textView = (TextView)findViewById(R.id.displayc);


        FileReader fr = new FileReader(dir_path + "/textedit.txt");
        BufferedReader br = new BufferedReader (fr);
        String line = "";
        while((line = br.readLine()) != null){

            System.out.println(line);

    }
}
}
