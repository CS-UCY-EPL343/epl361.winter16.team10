package com.example.irini.cafeorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FAQs extends AppCompatActivity {

    public static Button  but1;
    public static Button  but2;
    public static Button  but3;
    public static Button  but5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        onClickButtonListener();
    }


    public void onClickButtonListener() {

        but1= (Button)findViewById(R.id.but1);
        but1.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent1= new Intent(FAQs.this,Home.class);
                                         startActivity(intent1);
                                     }
                                 }
        );


        but2= (Button)findViewById(R.id.but2);
        but2.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent2= new Intent(FAQs.this,Menu.class);
                                         startActivity(intent2);
                                     }
                                 }
        );
        but3= (Button)findViewById(R.id.but3);
        but3.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent2= new Intent(FAQs.this,ContactUs.class);
                                         startActivity(intent2);
                                     }
                                 }
        );

        but5= (Button)findViewById(R.id.but5);
        but5.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent3= new Intent(FAQs.this,Order.class);
                                         startActivity(intent3);
                                     }
                                 }
        );


    } }

