package com.example.car_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Favourites extends AppCompatActivity implements View.OnClickListener {
Button btn, btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);

        btn1 = findViewById(R.id.button5);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button2){
            startActivity(new Intent(this, Profile.class));
        }
        else if(view.getId() == R.id.button5){
            startActivity(new Intent(this, MainScreen.class));
        }
    }
}