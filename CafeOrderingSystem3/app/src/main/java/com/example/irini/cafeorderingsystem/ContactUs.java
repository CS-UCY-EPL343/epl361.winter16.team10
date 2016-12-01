package com.example.irini.cafeorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactUs extends AppCompatActivity {

    private static Button  but2;
    private static Button  but3;
    private static Button  but5;
    private static Button  but6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        onClickButtonListener();
    }


    public void onClickButtonListener() {

        but2= (Button)findViewById(R.id.but2);
        but2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(ContactUs.this,Home.class);
                startActivity(intent1);
                                     }
                                 }
        );

        but3= (Button)findViewById(R.id.but3);
        but3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(ContactUs.this,Menu.class);
                startActivity(intent2);
                                     }
                                 }
        );

        but5= (Button)findViewById(R.id.but5);
        but5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(ContactUs.this,Order.class);
                startActivity(intent3);
                                     }
                                 }
        );

        but6= (Button)findViewById(R.id.but6);
        but6.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent3= new Intent(ContactUs.this,FAQs.class);
                                         startActivity(intent3);
                                     }
                                 }
        );

    } }


