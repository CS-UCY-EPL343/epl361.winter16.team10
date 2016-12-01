package com.example.irini.cafeorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order extends AppCompatActivity {

    public Button  but2;
    public Button  but3;
    public Button  but4;
    public Button  but6;
    public Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        onClickButtonListener();


    }


    public void onClickButtonListener() {

        but2= (Button)findViewById(R.id.but2);
        but2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(Order.this,Home.class);
                startActivity(intent1);
            }
        }
        );

        but3= (Button)findViewById(R.id.but3);
        but3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Order.this,Menu.class);
                startActivity(intent2);
            }
        }
        );

        but4= (Button)findViewById(R.id.but4);
        but4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(Order.this,ContactUs.class);
                startActivity(intent3);
                                     }
                                 }
        );


        but6= (Button)findViewById(R.id.but6);
        but6.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent3= new Intent(Order.this,FAQs.class);
                                         startActivity(intent3);
                                     }
                                 }
        );


        next= (Button)findViewById(R.id.next);
        next.setOnClickListener( new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent3= new Intent(Order.this,Next.class);
                                         startActivity(intent3);
                                     }
                                 }
        );

    } }


