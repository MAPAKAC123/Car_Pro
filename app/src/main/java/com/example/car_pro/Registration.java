package com.example.car_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Registration extends AppCompatActivity implements View.OnClickListener {
ImageButton btn, btn2;
Button btn1;
EditText edName, edFamilia, edOtchestvo, edMail, edLogin, edPassword, edPPaswword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btn = findViewById(R.id.imageButton);
        btn.setOnClickListener(this);

        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.imageButton2);
        btn2.setOnClickListener(this);

        int[] editTextIds = {R.id.edName, R.id.edFamilia, R.id.edOtchestvo, R.id.edMail, R.id.edLogin};

        for (int id : editTextIds) {
            EditText editText = findViewById(id);
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if (hasFocus) {
                        ((EditText) v).setText("");
                    }
                }
            });
        }
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.imageButton){
            startActivity(new Intent(this, HomeScreen.class));
        }
        if(view.getId() == R.id.button){
            startActivity(new Intent(this, LoginAccount.class));
        }
        if(view.getId() == R.id.imageButton2){
            startActivity(new Intent(this, MainScreen.class));
        }
    }
}
