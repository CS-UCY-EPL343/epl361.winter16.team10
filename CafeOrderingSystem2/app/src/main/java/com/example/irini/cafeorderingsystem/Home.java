package com.example.irini.cafeorderingsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
public class Home extends AppCompatActivity implements View.OnClickListener  {
    Button button1;
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        viewFlipper.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(3000);
    }
}