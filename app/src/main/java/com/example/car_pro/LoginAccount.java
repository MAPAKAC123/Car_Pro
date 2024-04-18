package com.example.car_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class LoginAccount extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2;
    ImageButton btn1, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_account);

        btn = findViewById(R.id.button4);
        btn.setOnClickListener(this);

        btn1 = findViewById(R.id.imageButton);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.button);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.imageButton2);
        btn3.setOnClickListener(this);

        EditText editText = findViewById(R.id.editTextText);

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    editText.setText(""); // Очищаем текст при фокусировке на EditText
                }
            }
        });
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button4){
            startActivity(new Intent(this,PasswordRecovery.class));
        }
        else if(view.getId() == R.id.imageButton){
            startActivity(new Intent(this, HomeScreen.class));
        }
        else if(view.getId() == R.id.button){
            startActivity(new Intent(this,Registration.class));
        }
        else if(view.getId() == R.id.imageButton2){
            startActivity(new Intent(this, MainScreen.class));
        }
    }
}