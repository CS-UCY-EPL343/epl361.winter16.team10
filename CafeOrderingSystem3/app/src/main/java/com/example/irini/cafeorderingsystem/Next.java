package com.example.irini.cafeorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Next extends AppCompatActivity {

    public Button snacks;
    public Button back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        onClickButtonListener();
    }

    public void onClickButtonListener() {

        snacks = (Button) findViewById(R.id.snacks);
        snacks.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent1 = new Intent(Next.this, snacks.class);
                                          startActivity(intent1);
                                      }
                                  }
        );

        back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent1 = new Intent(Next.this, Order.class);
                                          startActivity(intent1);
                                      }
                                  }
        );
    }
}