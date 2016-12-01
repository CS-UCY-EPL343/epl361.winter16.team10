package com.example.irini.cafeorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity {

    public Button  but1;
    public Button  but3;
    public Button  but4;
    public Button  but5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        onClickButtonListener();
    }


    public void onClickButtonListener() {

        but1= (Button)findViewById(R.id.but1);
        but1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(Home.this,Menu.class);
                        startActivity(intent1);
            }
        }
        );

        but3= (Button)findViewById(R.id.but3);
        but3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Home.this,ContactUs.class);
                startActivity(intent2);
                                     }
                                 }
        );

        but4= (Button)findViewById(R.id.but4);
        but4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(Home.this,Order.class);
                startActivity(intent3);
                                     }
                                 }
        );

        but5= (Button)findViewById(R.id.but5);
        but5.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent3= new Intent(Home.this,FAQs.class);
                                         startActivity(intent3);
                                     }
                                 }
        );



    } }

