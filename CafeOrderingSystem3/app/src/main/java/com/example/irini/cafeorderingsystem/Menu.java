package com.example.irini.cafeorderingsystem;

import android.content.Intent;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    public static Button  but1;
    public static Button  but3;
    public static Button  but5;
    public static Button  but4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        onClickButtonListener();
    }

    public void onClickButtonListener() {

        but1= (Button)findViewById(R.id.but1);
        but1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(Menu.this,Home.class);
                startActivity(intent1);
                                     }
                                 }
        );

        but3= (Button)findViewById(R.id.but3);
        but3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Menu.this,ContactUs.class);
                startActivity(intent2);
                                     }
                                 }
        );

        but5= (Button)findViewById(R.id.but5);
        but5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(Menu.this,Order.class);
                startActivity(intent3);
            }
        }
        );

        but4= (Button)findViewById(R.id.but4);
        but4.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent3= new Intent(Menu.this,FAQs.class);
                                         startActivity(intent3);
                                     }
                                 }
        );
    } }

