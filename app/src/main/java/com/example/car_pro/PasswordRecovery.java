package com.example.car_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class PasswordRecovery extends AppCompatActivity implements View.OnClickListener {
ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recovery);

        btn = findViewById(R.id.imageButton);
        btn.setOnClickListener(this);

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
        if(view.getId() == R.id.imageButton){
            startActivity(new Intent(this,LoginAccount.class));
        }
    }
}