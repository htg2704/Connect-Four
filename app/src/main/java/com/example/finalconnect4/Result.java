package com.example.finalconnect4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
        TextView t1,t2;
        public static final int red = 0;
    public static final int yel = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1= findViewById(R.id.textView);
        t2 = findViewById(R.id.textView1);

        Intent intent = getIntent();
       int x = intent.getIntExtra(MainActivity.reds,0);
        int y = intent.getIntExtra(MainActivity.yels,0);
        t1.setText("Player RED won "+x+" times");
        t2.setText("Player  YELLOW won "+y+" times");
    }



}
