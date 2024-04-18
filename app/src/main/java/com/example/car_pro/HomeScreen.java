package com.example.car_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener {
Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.button3);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.button){
            startActivity(new Intent(this,Registration.class));
        }
        else if(v.getId() == R.id.button3){
            startActivity(new Intent(this, MainScreen.class));
        }
    }
}