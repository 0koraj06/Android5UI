package com.example.a0koraj06.android5ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class insertname extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_insertname);



    }

    public void addscore(View view){

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.layout1);



        // Get the layout using its ID (what the previous line of code does)
        // Loop through each child element of the layout
        // if the current child element is an edit text then we read its contents and add it
        // to the total score.

      ArrayList<EditText> myEditTextList = new ArrayList<EditText>();

        for( int i = 0; i < layout.getChildCount(); i++ )
            if( layout.getChildAt( i ) instanceof EditText )
                myEditTextList.add( (EditText) layout.getChildAt( i ) );


        /** FIGHTER 1 **/
        EditText f1r1 = (EditText) findViewById(R.id.f1r1);

        EditText f1r2 = (EditText) findViewById(R.id.f1r2);

        EditText f1r3 = (EditText) findViewById(R.id.f1r3);

        EditText f1r4 = (EditText) findViewById(R.id.f1r4);

        EditText f1r5 = (EditText) findViewById(R.id.f1r5);

        EditText f1r6 = (EditText) findViewById(R.id.f1r6);

        EditText f1r7 = (EditText) findViewById(R.id.f1r7);

        EditText f1r8 = (EditText) findViewById(R.id.f1r8);

        EditText f1r9 = (EditText) findViewById(R.id.f1r9);

        EditText f1r10 = (EditText) findViewById(R.id.f1r10);

        EditText f1r11 = (EditText) findViewById(R.id.f1r11);

        EditText f1r12 = (EditText) findViewById(R.id.f1r12);



        EditText f2r1 = (EditText) findViewById(R.id.f2r1);

        EditText f2r2 = (EditText) findViewById(R.id.f2r2);

        EditText f2r3 = (EditText) findViewById(R.id.f2r3);

        EditText f2r4 = (EditText) findViewById(R.id.f2r4);

        EditText f2r5 = (EditText) findViewById(R.id.f2r5);

        EditText f2r6 = (EditText) findViewById(R.id.f2r6);

        EditText f2r7 = (EditText) findViewById(R.id.f2r7);

        EditText f2r8 = (EditText) findViewById(R.id.f2r8);

        EditText f2r9 = (EditText) findViewById(R.id.f2r9);

        EditText f2r10 = (EditText) findViewById(R.id.f2r10);

        EditText f2r11 = (EditText) findViewById(R.id.f2r11);

        EditText f2r12 = (EditText) findViewById(R.id.f2r12);


        int f1first = Integer.valueOf(f1r1.getText().toString());
        int f1second = Integer.valueOf(f1r2.getText().toString());
        int f1third = Integer.valueOf(f1r3.getText().toString());
        int f1forth = Integer.valueOf(f1r4.getText().toString());
        int f1fifth = Integer.valueOf(f1r5.getText().toString());
        int f1sixth = Integer.valueOf(f1r6.getText().toString());
        int f1seventh = Integer.valueOf(f1r7.getText().toString());
        int f1eighth = Integer.valueOf(f1r8.getText().toString());
        int f1ninth = Integer.valueOf(f1r9.getText().toString());
        int f1tenth = Integer.valueOf(f1r10.getText().toString());
        int f1eleventh = Integer.valueOf(f1r11.getText().toString());
        int f1twelth = Integer.valueOf(f1r12.getText().toString());

        int f2first = Integer.valueOf(f2r1.getText().toString());
        int f2second = Integer.valueOf(f2r2.getText().toString());
        int f2third = Integer.valueOf(f2r3.getText().toString());
        int f2forth = Integer.valueOf(f2r4.getText().toString());
        int f2fifth = Integer.valueOf(f2r5.getText().toString());
        int f2sixth = Integer.valueOf(f2r6.getText().toString());
        int f2seventh = Integer.valueOf(f2r7.getText().toString());
        int f2eighth = Integer.valueOf(f2r8.getText().toString());
        int f2ninth = Integer.valueOf(f2r9.getText().toString());
        int f2tenth = Integer.valueOf(f2r10.getText().toString());
        int f2eleventh = Integer.valueOf(f2r11.getText().toString());
        int f2twelth = Integer.valueOf(f2r12.getText().toString());

        int f1add = f1first + f1second + f1third + f1forth + f1fifth + f1sixth + f1seventh + f1eighth + f1ninth + f1tenth + f1eleventh +  f1twelth;
        int f2add = f2first + f2second + f2third + f2forth + f2fifth + f2sixth + f2seventh + f2eighth + f2ninth + f2tenth + f2eleventh +  f2twelth;

        TextView totalf1 = (TextView)findViewById(R.id.totalf1);
        TextView totalf2 = (TextView)findViewById(R.id.totalf2);


        totalf1.setText(Integer.toString(f1add));
        totalf2.setText(Integer.toString(f2add));
       /** int f1first = 0;

        if(! f1r1.getText().toString().equals("")) {
            f1first = Integer.valueOf(f1r1.getText().toString());
        }
        if(! f1r2.getText().toString().equals("")) {
            f1second = Integer.valueOf(f1r2.getText().toString());
        }
**/
























    }


}
