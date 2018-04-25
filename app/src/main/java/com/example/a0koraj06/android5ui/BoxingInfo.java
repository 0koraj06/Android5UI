package com.example.a0koraj06.android5ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoxingInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boxing_info);


        Button btn3 = (Button)findViewById(R.id.cchamp);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BoxingInfo.this, Champions.class));
            }
        });
        Button btn6 = (Button)findViewById(R.id.boxerDiary);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BoxingInfo.this, BoxingDiary.class));
            }
        });
    }
}
