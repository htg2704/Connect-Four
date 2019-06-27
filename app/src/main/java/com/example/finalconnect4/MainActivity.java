package com.example.finalconnect4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,newgame,result;
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25;
    int[][] a= new int[5][5];
    int turn = 1;
    int playwin=0,countR,countY;
    MyDrawable red = new MyDrawable();
    MyDrawableY yel = new MyDrawableY();
    public static final String reds = "red";
    public static final String yels = "yellow";
    public static final String mypref = "Mypref";
    SharedPreferences s;
    int c=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countR = 0;
        countY = 0;
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        newgame = findViewById(R.id.newgame);
        result = findViewById(R.id.results);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);
        i10 = findViewById(R.id.i10);
        i11 = findViewById(R.id.i11);
        i12 = findViewById(R.id.i12);
        i13 = findViewById(R.id.i13);
        i14 = findViewById(R.id.i14);
        i15 = findViewById(R.id.i15);
        i16 = findViewById(R.id.i16);
        i17 = findViewById(R.id.i17);
        i18 = findViewById(R.id.i18);
        i19 = findViewById(R.id.i19);
        i20 = findViewById(R.id.i20);
        i21 = findViewById(R.id.i21);
        i22 = findViewById(R.id.i22);
        i23 = findViewById(R.id.i23);
        i24 = findViewById(R.id.i24);
        i25 = findViewById(R.id.i25);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    if (a[4][0] == 0) {
                        i5.setImageDrawable(red);
                        a[4][0] = 1;
                    } else if (a[3][0] == 0) {
                        i4.setImageDrawable(red);
                        a[3][0] = 1;
                    } else if (a[2][0] == 0) {
                        i3.setImageDrawable(red);
                        a[2][0] = 1;
                    } else if (a[1][0] == 0) {
                        i2.setImageDrawable(red);
                        a[1][0] = 1;
                    } else if (a[0][0] == 0) {
                        i1.setImageDrawable(red);
                        a[0][0] = 1;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 2;
                } else {
                    if (a[4][0] == 0) {
                        i5.setImageDrawable(yel);
                        a[4][0] = 2;
                    } else if (a[3][0] == 0) {
                        i4.setImageDrawable(yel);
                        a[3][0] = 2;
                    } else if (a[2][0] == 0) {
                        i3.setImageDrawable(yel);
                        a[2][0] = 2;
                    } else if (a[1][0] == 0) {
                        i2.setImageDrawable(yel);
                        a[1][0] = 2;
                    } else if (a[0][0] == 0) {
                        i1.setImageDrawable(yel);
                        a[0][0] = 2;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 1;
                }
                check();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    if (a[4][1] == 0) {
                        i10.setImageDrawable(red);
                        a[4][1] = 1;
                    } else if (a[3][1] == 0) {
                        i9.setImageDrawable(red);
                        a[3][1] = 1;
                    } else if (a[2][1] == 0) {
                        i8.setImageDrawable(red);
                        a[2][1] = 1;
                    } else if (a[1][1] == 0) {
                        i7.setImageDrawable(red);
                        a[1][1] = 1;
                    } else if (a[0][1] == 0) {
                        i6.setImageDrawable(red);
                        a[0][1] = 1;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 2;
                } else {
                    if (a[4][1] == 0) {
                        i10.setImageDrawable(yel);
                        a[4][1] = 2;
                    } else if (a[3][1] == 0) {
                        i9.setImageDrawable(yel);
                        a[3][1] = 2;
                    } else if (a[2][1] == 0) {
                        i8.setImageDrawable(yel);
                        a[2][1] = 2;
                    } else if (a[1][1] == 0) {
                        i7.setImageDrawable(yel);
                        a[1][1] = 2;
                    } else if (a[0][1] == 0) {
                        i6.setImageDrawable(yel);
                        a[0][1] = 2;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 1;
                }
                check();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    if (a[4][2] == 0) {
                        i15.setImageDrawable(red);
                        a[4][2] = 1;
                    } else if (a[3][2] == 0) {
                        i14.setImageDrawable(red);
                        a[3][2] = 1;
                    } else if (a[2][2] == 0) {
                        i13.setImageDrawable(red);
                        a[2][2] = 1;
                    } else if (a[1][2] == 0) {
                        i12.setImageDrawable(red);
                        a[1][2] = 1;
                    } else if (a[0][2] == 0) {
                        i11.setImageDrawable(red);
                        a[0][2] = 1;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 2;
                } else {
                    if (a[4][2] == 0) {
                        i15.setImageDrawable(yel);
                        a[4][2] = 2;
                    } else if (a[3][2] == 0) {
                        i14.setImageDrawable(yel);
                        a[3][2] = 2;
                    } else if (a[2][2] == 0) {
                        i13.setImageDrawable(yel);
                        a[2][2] = 2;
                    } else if (a[1][2] == 0) {
                        i12.setImageDrawable(yel);
                        a[1][2] = 2;
                    } else if (a[0][2] == 0) {
                        i11.setImageDrawable(yel);
                        a[0][2] = 2;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 1;
                }
                check();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    if (a[4][3] == 0) {
                        i20.setImageDrawable(red);
                        a[4][3] = 1;
                    } else if (a[3][3] == 0) {
                        i19.setImageDrawable(red);
                        a[3][3] = 1;
                    } else if (a[2][3] == 0) {
                        i18.setImageDrawable(red);
                        a[2][3] = 1;
                    } else if (a[1][3] == 0) {
                        i17.setImageDrawable(red);
                        a[1][3] = 1;
                    } else if (a[0][3] == 0) {
                        i16.setImageDrawable(red);
                        a[0][3] = 1;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 2;
                } else {
                    if (a[4][3] == 0) {
                        i20.setImageDrawable(yel);
                        a[4][3] = 2;
                    } else if (a[3][3] == 0) {
                        i19.setImageDrawable(yel);
                        a[3][3] = 2;
                    } else if (a[2][3] == 0) {
                        i18.setImageDrawable(yel);
                        a[2][3] = 2;
                    } else if (a[1][3] == 0) {
                        i17.setImageDrawable(yel);
                        a[1][3] = 2;
                    } else if (a[0][3] == 0) {
                        i16.setImageDrawable(yel);
                        a[0][3] = 2;
                    } else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 1;
                }
                check();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn == 1) {
                    if (a[4][4] == 0) {
                        i25.setImageDrawable(red);
                        a[4][4] = 1;
                    } else if (a[3][4] == 0) {
                        i24.setImageDrawable(red);
                        a[3][4] = 1;
                    } else if (a[2][4] == 0) {
                        i23.setImageDrawable(red);
                        a[2][4] = 1;
                    } else if (a[1][4] == 0) {
                        i22.setImageDrawable(red);
                        a[1][4] = 1;
                    } else if (a[0][4] == 0) {
                        i21.setImageDrawable(red);
                        a[0][4] = 1;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 2;
                } else {
                    if (a[4][4] == 0) {
                        i25.setImageDrawable(yel);
                        a[4][4] = 2;
                    } else if (a[3][4] == 0) {
                        i24.setImageDrawable(yel);
                        a[3][4] = 2;
                    } else if (a[2][4] == 0) {
                        i23.setImageDrawable(yel);
                        a[2][4] = 2;
                    } else if (a[1][4] == 0) {
                        i22.setImageDrawable(yel);
                        a[1][4] = 2;
                    } else if (a[0][4] == 0) {
                        i21.setImageDrawable(yel);
                        a[0][4] = 2;
                    }else{
                        Toast.makeText(getApplicationContext(), "Play valid move", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    turn = 1;
                }
                check();
            }

            ;


        });
        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i1.setImageDrawable(null);
                i2.setImageDrawable(null);
                i3.setImageDrawable(null);
                i4.setImageDrawable(null);
                i5.setImageDrawable(null);
                i6.setImageDrawable(null);
                i7.setImageDrawable(null);
                i8.setImageDrawable(null);
                i9.setImageDrawable(null);
                i10.setImageDrawable(null);
                i11.setImageDrawable(null);
                i12.setImageDrawable(null);
                i13.setImageDrawable(null);
                i14.setImageDrawable(null);
                i15.setImageDrawable(null);
                i16.setImageDrawable(null);
                i17.setImageDrawable(null);
                i18.setImageDrawable(null);
                i19.setImageDrawable(null);
                i20.setImageDrawable(null);
                i21.setImageDrawable(null);
                i22.setImageDrawable(null);
                i23.setImageDrawable(null);
                i24.setImageDrawable(null);
                i25.setImageDrawable(null);
                i1.setBackgroundColor(Color.rgb(255,255,255));
                i2.setBackgroundColor(Color.rgb(255,255,255));
                i3.setBackgroundColor(Color.rgb(255,255,255));
                i4.setBackgroundColor(Color.rgb(255,255,255));
                i5.setBackgroundColor(Color.rgb(255,255,255));
                i6.setBackgroundColor(Color.rgb(255,255,255));
                i7.setBackgroundColor(Color.rgb(255,255,255));
                i8.setBackgroundColor(Color.rgb(255,255,255));
                i9.setBackgroundColor(Color.rgb(255,255,255));
                i10.setBackgroundColor(Color.rgb(255,255,255));
                i11.setBackgroundColor(Color.rgb(255,255,255));
                i12.setBackgroundColor(Color.rgb(255,255,255));
                i13.setBackgroundColor(Color.rgb(255,255,255));
                i14.setBackgroundColor(Color.rgb(255,255,255));
                i15.setBackgroundColor(Color.rgb(255,255,255));
                i16.setBackgroundColor(Color.rgb(255,255,255));
                i17.setBackgroundColor(Color.rgb(255,255,255));
                i18.setBackgroundColor(Color.rgb(255,255,255));
                i19.setBackgroundColor(Color.rgb(255,255,255));
                i20.setBackgroundColor(Color.rgb(255,255,255));
                i21.setBackgroundColor(Color.rgb(255,255,255));
                i22.setBackgroundColor(Color.rgb(255,255,255));
                i23.setBackgroundColor(Color.rgb(255,255,255));
                i24.setBackgroundColor(Color.rgb(255,255,255));
                i25.setBackgroundColor(Color.rgb(255,255,255));
                a = new int[5][5];
            turn = 1;
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
            }
        });
    }
    void check(){
        if(a[0][0]==1&&a[0][1]==1&&a[0][2]==1&&a[0][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][4]==1&&a[0][1]==1&&a[0][2]==1&&a[0][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else if(a[1][0]==1&&a[1][1]==1&&a[1][2]==1&&a[1][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[1][4]==1&&a[1][1]==1&&a[1][2]==1&&a[1][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else if(a[2][0]==1&&a[2][1]==1&&a[2][2]==1&&a[2][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[2][4]==1&&a[2][1]==1&&a[2][2]==1&&a[2][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else if(a[3][0]==1&&a[3][1]==1&&a[3][2]==1&&a[3][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[3][4]==1&&a[3][1]==1&&a[3][2]==1&&a[3][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else if(a[4][0]==1&&a[4][1]==1&&a[4][2]==1&&a[4][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][4]==1&&a[4][1]==1&&a[4][2]==1&&a[4][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else if(a[0][0]==1&&a[1][0]==1&&a[2][0]==1&&a[3][0]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][0]==1&&a[1][0]==1&&a[2][0]==1&&a[3][0]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else if(a[0][1]==1&&a[1][1]==1&&a[2][1]==1&&a[3][1]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][1]==1&&a[1][1]==1&&a[2][1]==1&&a[3][1]==1) {
            playwin = 1;
            Toast.makeText(getApplicationContext(), "Game over,Player RED won", Toast.LENGTH_SHORT).show();
        }else if(a[0][2]==1&&a[1][2]==1&&a[2][2]==1&&a[3][2]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][2]==1&&a[1][2]==1&&a[2][2]==1&&a[3][2]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }
        else if(a[0][3]==1&&a[1][3]==1&&a[2][3]==1&&a[3][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][3]==1&&a[1][3]==1&&a[2][3]==1&&a[3][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }
        else if(a[0][4]==1&&a[1][4]==1&&a[2][4]==1&&a[3][4]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][4]==1&&a[1][4]==1&&a[2][4]==1&&a[3][4]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][4]==1&&a[1][1]==1&&a[2][2]==1&&a[3][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][0]==1&&a[1][1]==1&&a[2][2]==1&&a[3][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][4]==1&&a[1][3]==1&&a[2][2]==1&&a[3][1]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][0]==1&&a[1][3]==1&&a[2][2]==1&&a[3][1]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[1][4]==1&&a[2][3]==1&&a[3][2]==1&&a[4][1]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][3]==1&&a[2][1]==1&&a[1][2]==1&&a[3][0]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][1]==1&&a[1][2]==1&&a[2][3]==1&&a[3][4]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else
        if(a[1][0]==1&&a[2][1]==1&&a[3][2]==1&&a[4][3]==1){
            playwin=1;
            Toast.makeText(getApplicationContext(),"Game over,Player RED won",Toast.LENGTH_SHORT).show();
        }else if(a[0][0]==2&&a[0][1]==2&&a[0][2]==2&&a[0][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][4]==2&&a[0][1]==2&&a[0][2]==2&&a[0][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else if(a[1][0]==2&&a[1][1]==2&&a[1][2]==2&&a[1][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[1][4]==2&&a[1][1]==2&&a[1][2]==2&&a[1][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else if(a[2][0]==2&&a[2][1]==2&&a[2][2]==2&&a[2][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[2][4]==2&&a[2][1]==2&&a[2][2]==2&&a[2][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else if(a[3][0]==2&&a[3][1]==2&&a[3][2]==2&&a[3][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[3][4]==2&&a[3][1]==2&&a[3][2]==2&&a[3][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else if(a[4][0]==2&&a[4][1]==2&&a[4][2]==2&&a[4][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][4]==2&&a[4][1]==2&&a[4][2]==2&&a[4][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else if(a[0][0]==2&&a[1][0]==2&&a[2][0]==2&&a[3][0]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][0]==2&&a[1][0]==2&&a[2][0]==2&&a[3][0]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else if(a[0][1]==2&&a[1][1]==2&&a[2][1]==2&&a[3][1]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][1]==2&&a[1][1]==2&&a[2][1]==2&&a[3][1]==2) {
            playwin=2;
            Toast.makeText(getApplicationContext(), "Game over,Player YELLOW won", Toast.LENGTH_SHORT).show();
        }else if(a[0][2]==2&&a[1][2]==2&&a[2][2]==2&&a[3][2]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][2]==2&&a[1][2]==2&&a[2][2]==2&&a[3][2]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }
        else if(a[0][3]==2&&a[1][3]==2&&a[2][3]==2&&a[3][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][3]==2&&a[1][3]==2&&a[2][3]==2&&a[3][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }
        else if(a[0][4]==2&&a[1][4]==2&&a[2][4]==2&&a[3][4]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][4]==2&&a[1][4]==2&&a[2][4]==2&&a[3][4]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][4]==2&&a[1][1]==2&&a[2][2]==2&&a[3][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][0]==2&&a[1][1]==2&&a[2][2]==2&&a[3][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][4]==2&&a[1][3]==2&&a[2][2]==2&&a[3][1]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[4][0]==2&&a[1][3]==2&&a[2][2]==2&&a[3][1]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[1][4]==2&&a[2][3]==2&&a[3][2]==2&&a[4][1]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][3]==2&&a[2][1]==2&&a[1][2]==2&&a[3][0]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[0][1]==2&&a[1][2]==2&&a[2][3]==2&&a[3][4]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }else
        if(a[1][0]==2&&a[2][1]==2&&a[3][2]==2&&a[4][3]==2){
            playwin=2;
            Toast.makeText(getApplicationContext(),"Game over,Player YELLOW won",Toast.LENGTH_SHORT).show();
        }
        s = getSharedPreferences(mypref,MODE_PRIVATE);
        SharedPreferences.Editor editor = s.edit();
        editor.putInt(reds,0);
        editor.putInt(yels,0);
        if(playwin==1){
            countR++;
            editor.putInt(reds,countR);
            Log.i("imp","executed");
            editor.apply();
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            playwin =0;
        } else
        if(playwin==2){
            countY++;
            editor.putInt(yels,countY);
            Log.i("imp","executedY");
            editor.apply();
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            playwin=0;
        }

        c += s.getInt(reds,0);
        b += s.getInt(yels,0);
    }
    public void results(View view){
        int x=0,y=0;

        x+= c;
        y+=b;
        Intent intent = new Intent(getApplicationContext(), Result.class);
        intent.putExtra(reds,x);
        intent.putExtra(yels,y);
        startActivity(intent);

    }
}
