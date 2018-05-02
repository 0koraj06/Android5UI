package com.example.a0koraj06.android5ui;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Jason on 20/04/2018.
 */

public class Champions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.champions);


        try {
            // TextView has an append()
            TextView textview = (TextView) findViewById(R.id.displayc);

            Log.d("assignment", "Champions.onCreate()");
            BufferedReader reader = new BufferedReader(new FileReader(Environment.getExternalStorageDirectory().getAbsolutePath()+"/champions.txt"));
            String line = "";

            while ((line = reader.readLine()) != null) {
                Log.d("assignment", "Current line: " + line);
                textview.append(line + "\n" );
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e);
            Log.d("assignment", "Error opening file: " + e.toString());
        }
    }
         }





